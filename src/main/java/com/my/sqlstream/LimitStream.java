package com.my.sqlstream;

public class LimitStream extends SQLStream {
    protected LimitStream(SQLStreamData data) {
        super(data);
    }

    public SQLStream OFFSET(long offset){
        data.limit += " OFFSET " + Long.toString(offset);
        return this;
    }
}
