package com.my.sqlstream;

public class OrderByStreamWithDirection extends OrderByStream {
    protected OrderByStreamWithDirection(SQLStreamData data) {
        super(data);
    }

    public OrderByStream asc(){
        data.orderBy += " ASC";
        return this;
    }
    public OrderByStream desc(){
        data.orderBy += " DESC";
        return this;
    }
}
