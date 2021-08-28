package com.striker.sqlstream.stream;

import com.striker.sqlstream.tableproxies.Table;

import java.util.stream.Stream;

public class HavingStream extends OrderByStream {
    protected HavingStream(SQLStreamData data) {
        super(data);
    }

    public OrderByStream ORDER_BY(Table.OrderableColumn... columns){
        return ORDER_BY(Stream.of(columns).map(Table.OrderableColumn::getColumnName).toArray(String[]::new));
    }
    public OrderByStream ORDER_BY(String... columns){
        data.orderBy = "ORDER BY " + String.join(", ", columns);
        return this;
    }
}
