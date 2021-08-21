package com.my.sqlstream;


public class FromStream extends WhereStream {
    protected FromStream(SQLStreamData data) {
        super(data);
    }

    public JoinStream innerJoin(String table){
        data.from.append(" INNER JOIN ").append(table);
        return new JoinStream(data);
    }
    public JoinStrictStream leftJoin(String table){
        data.from.append(" LEFT JOIN ").append(table);
        return new JoinStrictStream(data);
    }
    public JoinStrictStream rightJoin(String table){
        data.from.append(" RIGHT JOIN ").append(table);
        return new JoinStrictStream(data);
    }
    public WhereStream where(String condition){
        data.where = "WHERE " + condition;
        return new WhereStream(data);
    }
}
