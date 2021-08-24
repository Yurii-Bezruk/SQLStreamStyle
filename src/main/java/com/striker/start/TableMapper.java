package com.striker.start;

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
        createJava(tableData);
        compileJava();
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

    private static void createJava(Map<String, List<String>> tableData) {
        JavaClassCreator creator = new JavaClassCreator("Tables", sourceFolder);
        creator.packageName = "com.striker.tableproxies";
        creator.classBody.constructors = new String[]{"private Tables(){}"};
        List<JavaClassCreator.Class> nestedClasses = new ArrayList<>();
        for (String table : tableData.keySet()) {
            String nestedClassName = table + "Table";
            JavaClassCreator.Class nestedClass = new JavaClassCreator.Class(nestedClassName);
            nestedClass.superClassName = "Table";

            nestedClass.fields =
                    tableData.get(table).stream()
                            .map(column -> "public final Column " + column + " = new Column(\"" + column + "\");")
                            .toArray(String[]::new);

            nestedClass.constructors = new String[]{
                    "public "+nestedClassName+"() {\n" +
                            "\t\t\tsuper(\""+table+"\");\n" +
                            "\t\t}"};
            nestedClasses.add(nestedClass);
        }
        creator.classBody.nestedClasses = nestedClasses.toArray(new JavaClassCreator.Class[0]);
        creator.classBody.fields = tableData.keySet().stream().map(table ->
                "public static final "+table+"Table "+table+" = new "+table+"Table();")
                .toArray(String[]::new);
        creator.createJavaFile();
    }

    private static void compileJava(){
        try {
            Runtime.getRuntime().exec("javac Table.java Tables.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static class JavaClassCreator {
        String path;
        String packageName;
        String[] imports;
        Class classBody;

        public JavaClassCreator(String className, String path) {
            classBody = new Class(className);
            this.path = path;
        }

        public void createJavaFile(){
            try (PrintWriter writer = new PrintWriter( path + "/" +
                    packageName.replace('.', '/') + "/" + classBody.className + ".java")){
                writer.printf("package %s;%n%n", packageName);
                writer.printf("public final class %s {%n", classBody.className);
                for (String field : classBody.fields) {
                    writer.println("\t"+field);
                }
                writer.println();
                for (String constructor : classBody.constructors) {
                    writer.println("\t"+constructor);
                }
                writer.println();
                for (Class nestedClass : classBody.nestedClasses) {
                    writer.printf("\tpublic static class %s extends %s {%n", nestedClass.className, nestedClass.superClassName);
                    for (String field : nestedClass.fields) {
                        writer.println("\t\t"+field);
                    }
                    writer.println();
                    for (String constructor : nestedClass.constructors) {
                        writer.println("\t\t"+constructor);
                    }
                    writer.println("\t}");
                }
                writer.println("\n}");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        static class Class {
            String className;
            String superClassName;
            String[] fields;
            String[] methods;
            String[] constructors;
            Class[] nestedClasses;

            public Class(String className) {
                this.className = className;
            }

            @Override
            public String toString() {
                return "Class{}";
            }
        }
    }
}
