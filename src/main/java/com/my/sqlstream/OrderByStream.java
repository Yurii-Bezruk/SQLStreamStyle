package com.my.sqlstream;

public class OrderByStream extends SQLStream {
    protected OrderByStream(SQLStreamData data) {
        super(data);
    }

    public LimitStream limit(long limit){
        data.limit = "LIMIT " + Long.toString(limit);
        return new LimitStream(data);
    }
    public SQLStream limit(long start, long limit){
        data.limit = "LIMIT " + Long.toString(start) + ", " + Long.toString(limit);
        return this;
    }
}
