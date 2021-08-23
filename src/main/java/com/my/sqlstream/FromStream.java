package com.my.sqlstream;


import com.my.tableproxies.Table;

public class FromStream extends WhereStream {
    protected FromStream(SQLStreamData data) {
        super(data);
    }

    public JoinStream INNER_JOIN(Table table){
        return INNER_JOIN(table.getTableName());
    }
    public JoinStream INNER_JOIN(String table){
        data.from.append(" INNER JOIN ").append(table);
        return new JoinStream(data);
    }

    public JoinStrictStream LEFT_JOIN(Table table){
        return LEFT_JOIN(table.getTableName());
    }
    public JoinStrictStream LEFT_JOIN(String table){
        data.from.append(" LEFT JOIN ").append(table);
        return new JoinStrictStream(data);
    }

    public JoinStrictStream RIGHT_JOIN(Table table){
        return RIGHT_JOIN(table.getTableName());
    }
    public JoinStrictStream RIGHT_JOIN(String table){
        data.from.append(" RIGHT JOIN ").append(table);
        return new JoinStrictStream(data);
    }

    //TODO polymorphic calls to WHERE
    public WhereStream WHERE(String condition){
        data.where = "WHERE " + condition;
        return new WhereStream(data);
    }
}
