package com.my.sqlstream;

public class GroupByStream extends HavingStream {
    public GroupByStream(SQLStreamData data) {
        super(data);
    }

    //TODO polymorphic calls to HAVING
    public HavingStream HAVING(String condition){
        data.having = "HAVING " + condition;
        return this;
    }
}
