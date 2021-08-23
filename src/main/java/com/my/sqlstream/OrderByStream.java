package com.my.sqlstream;

public class OrderByStream extends SQLStream {
    protected OrderByStream(SQLStreamData data) {
        super(data);
    }

    public LimitStream LIMIT(long limit){
        data.limit = "LIMIT " + Long.toString(limit);
        return new LimitStream(data);
    }
    public SQLStream LIMIT(long offset, long limit){
        data.limit = "LIMIT " + Long.toString(offset) + ", " + Long.toString(limit);
        return this;
    }
}
