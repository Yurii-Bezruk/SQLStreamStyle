package com.my.sqlstream;


public class FromStream extends WhereStream {
    protected FromStream(SQLStreamData data) {
        super(data);
    }

    public JoinStream INNER_JOIN(String table){
        data.from.append(" INNER JOIN ").append(table);
        return new JoinStream(data);
    }
    public JoinStrictStream LEFT_JOIN(String table){
        data.from.append(" LEFT JOIN ").append(table);
        return new JoinStrictStream(data);
    }
    public JoinStrictStream RIGHT_JOIN(String table){
        data.from.append(" RIGHT JOIN ").append(table);
        return new JoinStrictStream(data);
    }
    public WhereStream WHERE(String condition){
        data.where = "WHERE " + condition;
        return new WhereStream(data);
    }
}
