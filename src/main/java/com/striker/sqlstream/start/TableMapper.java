package com.striker.sqlstream.start;

import java.io.*;
import java.sql.*;
import java.util.*;

public class TableMapper {
    private static final String connectionURL;
    private static final String showTablesQuery = "SHOW TABLES;";
    private static final String showColumnsQuery = "SHOW COLUMNS IN ";
    private static final String sourceFolder;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("app.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        connectionURL =
            properties.getProperty("server.protocol") +
            "://" +
            properties.getProperty("server.address") +
            ":" +
            properties.getProperty("server.port") +
            "/" +
            properties.getProperty("server.schema") +
            "?serverTimeZone=" +
            properties.getProperty("server.timezone") +
            "&user=" +
            properties.getProperty("user.name") +
            "&password=" +
            properties.getProperty("user.password");
        sourceFolder = properties.getProperty("project.sourcefolder");
    }

    public static String getConnectionURL() {
        return connectionURL;
    }

    public static void map() {
        Map<String, List<String>> tableData = loadTableData();
        createMappedTablesJavaFile(tableData);
    }

    private static Map<String, List<String>> loadTableData() {
        Map<String, List<String>> tables = null;
        try(Connection connection = DriverManager.getConnection(connectionURL);
            Statement tableStatement = connection.createStatement();
            Statement columnStatement = connection.createStatement();
            ResultSet tablesResult = tableStatement.executeQuery(showTablesQuery)){
            tables = new HashMap<>();
            while(tablesResult.next()){
                String table = tablesResult.getNString(1);
                List<String> columns = new ArrayList<>();
                try(ResultSet columnsResult = columnStatement.executeQuery(showColumnsQuery + table + ";")){
                    while(columnsResult.next()){
                        columns.add(columnsResult.getNString(1));
                    }
                }
                tables.put(table, columns);
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return tables;
    }
    private static void createMappedTablesJavaFile(Map<String, List<String>> tableData) {
        try (PrintWriter writer = new PrintWriter( sourceFolder + "/com/striker/sqlstream/tableproxies/Tables.java")){
            writer.print(
                "package com.striker.sqlstream.tableproxies;\n\n" +
                "public final class Tables {\n\n");
            for (String table : tableData.keySet()) {
                writer.printf("\tpublic static final %sTable %s = new %sTable();\n", table, table, table);
            }
            writer.println("\n\tprivate Tables(){}\n");

            for (String table : tableData.keySet()) {
                writer.printf("\tpublic static class %sTable extends Table {\n", table);
                for (String column : tableData.get(table)) {
                    writer.printf("\t\tpublic final Column %s = new Column(\"%s\");\n", column, column);
                }
                writer.printf(
                    "\n\t\tpublic %sTable() {\n" +
                    "\t\t\tsuper(\"%s\");\n" +
                    "\t\t}\n" +
                    "\t}\n", table, table);
            }
            writer.println("}");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
