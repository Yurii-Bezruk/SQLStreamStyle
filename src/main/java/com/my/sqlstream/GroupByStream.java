package com.my.sqlstream;

public class GroupByStream extends HavingStream {
    public GroupByStream(SQLStreamData data) {
        super(data);
    }
    public HavingStream having(String condition){
        data.having = "HAVING " + condition;
        return this;
    }
}
