package com.striker.sqlstream.stream;

import com.striker.sqlstream.start.TableMapper;
import com.striker.sqlstream.tableproxies.Table;
import com.striker.sqlstream.help.SelectOptions.SelectOption;
import java.sql.*;
import java.util.*;
import java.util.stream.Stream;

public abstract class SQLStream {
    protected static String URL = TableMapper.getConnectionURL();
    protected SQLStreamData data;

    protected SQLStream() {
        this(new SQLStreamData());
    }
    protected SQLStream(SQLStreamData data) {
        this.data = data;
    }


    public static SelectStream SELECT(SelectOption options, Table.SelectableColumn... columns){
        SelectStream stream = SELECT(columns);
        stream.data.selectOptions = options.getName();
        return stream;
    }
    public static SelectStream SELECT(SelectOption options, String... columns){
        SelectStream stream = SELECT(columns);
        stream.data.selectOptions = options.getName();
        return stream;
    }
    public static SelectStream SELECT(Table.SelectableColumn... columns){
        return SELECT(Stream.of(columns).map(Table.SelectableColumn::getColumnName).toArray(String[]::new));
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
        return "SELECT " + data.selectOptions + " " +
            String.join(", ", data.select) + " " +
            String.join(" ",
                data.from,
                data.where,
                data.groupBy,
                data.having,
                data.orderBy,
                data.limit) + ";";
    }

    public String toFormattedString() {
        return "SELECT " + data.selectOptions + " " +
            String.join(", ", data.select) + "\n" +
            String.join("\n",
                Stream.of(
                    data.from,
                    data.where,
                    data.groupBy,
                    data.having,
                    data.orderBy,
                    data.limit)
                    .filter(part -> !part.equals(""))
                    .toArray(CharSequence[]::new)
            ) + ";";
    }

    public com.striker.sqlstream.help.ResultSet execute(){
        List<Map<String, Object>> rows = null;
        try(Connection connection = DriverManager.getConnection(URL);
            Statement statement = connection.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery(toString())){
            rows = new ArrayList<>();
            while(resultSet.next()){
                Map<String, Object> row = new HashMap<>();
                for (int i = 0; true; i++) {
                    try {
                        String columnName = data.select.get(i);
                        if (columnName.contains(" AS ")){
                            columnName = columnName.substring(columnName.indexOf(" AS ") + 4);
                        }
                        row.put(columnName, resultSet.getObject(i + 1));
                    } catch (IndexOutOfBoundsException | SQLException e){
                        break;
                    }
                }
                rows.add(row);
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return new com.striker.sqlstream.help.ResultSet(rows);
    }

    protected static class SQLStreamData {
        List<String> select = new ArrayList<>();
        String selectOptions = "";
        StringBuilder from = new StringBuilder("FROM ");
        String where = "";
        String groupBy = "";
        String having = "";
        String orderBy = "";
        String limit = "";
    }
}
