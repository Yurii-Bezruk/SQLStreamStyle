package com.striker.sqlstream.help;

import com.striker.sqlstream.tableproxies.Table;
import com.striker.sqlstream.tableproxies.Table.Column;

public final class Functions {
    //TODO CASE operator
    public static Column ABS(Column column){
        return functionTo("ABS", column);
    }
    public static Column AVG(Column column){
        return functionTo("AVG", column);
    }
    public static Column CEIL(Column column){
        return functionTo("CEIL", column);
    }
    public static Column CEILING(Column column){
        return functionTo("CEILING", column);
    }

    private static Column functionTo(String function, Column column){
        Table table = new Table(column.getTable().getTableName());
        table.setTableName(function+"("+table.getTableName());
        Column newColumn = table.new Column(column.getClearName());
        newColumn.setColumnName(newColumn.getClearName()+")");
        return newColumn;
    }
}
