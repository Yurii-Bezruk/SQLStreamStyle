package com.striker.sqlstream;


import com.striker.tableproxies.Table;

public class WhereStream extends GroupByStream {
    protected WhereStream(SQLStreamData data) {
        super(data);
    }

    public GroupByStream GROUP_BY(Table.Column column){
        return GROUP_BY(column.getColumnName());
    }
    public GroupByStream GROUP_BY(String column){
        data.groupBy = "GROUP BY " + column;
        return this;
    }
}
