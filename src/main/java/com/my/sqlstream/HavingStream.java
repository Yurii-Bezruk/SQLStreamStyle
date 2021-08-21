package com.my.sqlstream;

public class HavingStream extends OrderByStream {
    protected HavingStream(SQLStreamData data) {
        super(data);
    }

    public OrderByStreamWithDirection orderBy(String column){
        data.orderBy = "ORDER BY " + column;
        return new OrderByStreamWithDirection(data);
    }
}
