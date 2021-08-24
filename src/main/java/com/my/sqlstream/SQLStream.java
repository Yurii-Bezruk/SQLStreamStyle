package com.my.sqlstream;

import com.my.tableproxies.Table;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.*;
import java.util.stream.Stream;

public abstract class SQLStream {
    protected static String URL;
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("app.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        URL =
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
    protected SQLStreamData data;

    protected SQLStream() {
        this(new SQLStreamData());
    }
    protected SQLStream(SQLStreamData data) {
        this.data = data;
    }

    public static SelectStream SELECT(Table.Column... columns){
        return SELECT(Stream.of(columns).map(Table.Column::getColumnName).toArray(String[]::new));
    }
    public static SelectStream SELECT(String... columns){
        SelectStream select = new SelectStream();
        Collections.addAll(select.data.select, columns);
        return select;
    }

    @Override
    public String toString() {
        return "SELECT " +
            String.join(", ", data.select) +
            String.join(" ",
                data.from,
                data.where,
                data.groupBy,
                data.having,
                data.orderBy,
                data.limit) + ";";
    }

    public String toFormattedString() {
        return "SELECT " +
            String.join(", ", data.select) +
            String.join("\n ",
                data.from,
                data.where,
                data.groupBy,
                data.having,
                data.orderBy,
                data.limit) + ";";
    }

    public List<Map<String, Object>> execute(){
        List<Map<String, Object>> rows = null;
        try(Connection connection = DriverManager.getConnection(URL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(toString())){
            rows = new ArrayList<>();
            while(resultSet.next()){
                Map<String, Object> row = new HashMap<>();
                for (int i = 0; true; i++) {
                    try {
                        row.put(data.select.get(i), resultSet.getObject(i + 1));
                    } catch (IndexOutOfBoundsException | SQLException e){
                        break;
                    }
                }
                rows.add(row);
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return rows;
    }

    protected static class SQLStreamData {
        List<String> select = new ArrayList<>();
        StringBuilder from = new StringBuilder("FROM ");
        String where = "";
        String groupBy = "";
        String having = "";
        String orderBy = "";
        String limit = "";
    }
}
