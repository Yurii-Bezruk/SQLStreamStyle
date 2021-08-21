package com.my.sqlstream;


public class WhereStream extends GroupByStream {
    protected WhereStream(SQLStreamData data) {
        super(data);
    }

    public GroupByStream groupBy(String column){
        data.groupBy = "GROUP BY " + column;
        return this;
    }
}
