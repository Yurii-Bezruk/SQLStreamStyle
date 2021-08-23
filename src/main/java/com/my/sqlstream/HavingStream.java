package com.my.sqlstream;

public class HavingStream extends OrderByStream {
    protected HavingStream(SQLStreamData data) {
        super(data);
    }

    public OrderByStream ORDER_BY(String column){
        data.orderBy = "ORDER BY " + column;
        return new OrderByStream(data);
    }
}
