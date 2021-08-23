package com.my.start;

import java.io.*;
import java.sql.*;
import java.util.*;

public class TableMapper {
    private static final String connectionURL;
    private static final String showTablesQuery = "SHOW TABLES;";
    private static final String showColumnsQuery = "SHOW COLUMNS IN ";

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
    }

    public static String getConnectionURL() {
        return connectionURL;
    }

    public static void map() {
        Map<String, List<String>> tableData = loadTableData();
        createJava(tableData);
    }

    private static void createJava(Map<String, List<String>> tableData) {
        try (PrintWriter writer = new PrintWriter("Tables.java")){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

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

    private static class JavaClassCreator {
        String filename;
        String packageName;
        List<String> imports;
        String className;
        List<String> fields;
        List<String> constructors;

        public JavaClassCreator(String fileName) {
            this.filename = fileName;
        }

        static class NestedClass {

        }
    }
}
