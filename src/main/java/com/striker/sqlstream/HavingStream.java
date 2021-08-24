package com.striker.sqlstream;

import com.striker.tableproxies.Table;

public class HavingStream extends OrderByStream {
    protected HavingStream(SQLStreamData data) {
        super(data);
    }

    public OrderByStream ORDER_BY(Table.Column column){
        return ORDER_BY(column.getColumnName());
    }
    public OrderByStream ORDER_BY(String column){
        data.orderBy = "ORDER BY " + column;
        return new OrderByStream(data);
    }
}
