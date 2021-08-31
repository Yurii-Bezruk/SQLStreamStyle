package com.striker.sqlstream.stream;


import com.striker.sqlstream.tableproxies.Table;

import java.util.stream.Stream;

public class FromStream extends WhereStream {
    protected FromStream(SQLStreamData data) {
        super(data);
    }

    public FromStream JOIN(Table... tables){
        return INNER_JOIN(tables);
    }
    public FromStream JOIN(String... tables){
        return INNER_JOIN(tables);
    }
    public JoinStream JOIN(Table table){
        return INNER_JOIN(table);
    }
    public JoinStream JOIN(String table){
        return INNER_JOIN(table);
    }

    public FromStream CROSS_JOIN(Table... tables){
        return INNER_JOIN(tables);
    }
    public FromStream CROSS_JOIN(String... tables){
        return INNER_JOIN(tables);
    }
    public JoinStream CROSS_JOIN(Table table){
        return INNER_JOIN(table);
    }
    public JoinStream CROSS_JOIN(String table){
        return INNER_JOIN(table);
    }

    public FromStream INNER_JOIN(Table... tables){
        return INNER_JOIN(Stream.of(tables).map(Table::getTableName).toArray(String[]::new));
    }
    public FromStream INNER_JOIN(String... tables){
        data.from.append(" INNER JOIN ").append(String.join(", ", tables));
        return this;
    }
    public JoinStream INNER_JOIN(Table table){
        return INNER_JOIN(table.getTableName());
    }
    public JoinStream INNER_JOIN(String table){
        data.from.append(" INNER JOIN ").append(table);
        return new JoinStream(data);
    }

    public FromStream STRAIGHT_JOIN(Table... tables){
        return STRAIGHT_JOIN(Stream.of(tables).map(Table::getTableName).toArray(String[]::new));
    }
    public FromStream STRAIGHT_JOIN(String... tables){
        data.from.append(" STRAIGHT_JOIN ").append(String.join(", ", tables));
        return this;
    }
    public JoinStream STRAIGHT_JOIN(Table table){
        return STRAIGHT_JOIN(table.getTableName());
    }
    public JoinStream STRAIGHT_JOIN(String table){
        data.from.append(" STRAIGHT_JOIN ").append(table);
        return new JoinStream(data);
    }

    public JoinStrictStream LEFT_OUTER_JOIN(Table table){
        return LEFT_JOIN(table);
    }
    public JoinStrictStream LEFT_OUTER_JOIN(String table){
        return LEFT_JOIN(table);
    }
    public JoinStrictStream LEFT_JOIN(Table table){
        return LEFT_JOIN(table.getTableName());
    }
    public JoinStrictStream LEFT_JOIN(String table){
        data.from.append(" LEFT JOIN ").append(table);
        return new JoinStrictStream(data);
    }

    public JoinStrictStream RIGHT_OUTER_JOIN(Table table){
        return RIGHT_JOIN(table);
    }
    public JoinStrictStream RIGHT_OUTER_JOIN(String table){
        return RIGHT_JOIN(table);
    }
    public JoinStrictStream RIGHT_JOIN(Table table){
        return RIGHT_JOIN(table.getTableName());
    }
    public JoinStrictStream RIGHT_JOIN(String table){
        data.from.append(" RIGHT JOIN ").append(table);
        return new JoinStrictStream(data);
    }

    //TODO polymorphic calls to WHERE
    public WhereStream WHERE(Table.Column condition){
        return WHERE(condition.getColumnName());
    }
    public WhereStream WHERE(String condition){
        data.where = "WHERE " + condition;
        return new WhereStream(data);
    }
}
