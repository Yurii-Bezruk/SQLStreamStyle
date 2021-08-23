package com.my.sqlstream;


public class WhereStream extends GroupByStream {
    protected WhereStream(SQLStreamData data) {
        super(data);
    }

    public GroupByStream GROUP_BY(String column){
        data.groupBy = "GROUP BY " + column;
        return this;
    }
}
