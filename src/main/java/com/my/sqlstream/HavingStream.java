package com.my.sqlstream;

import com.my.tableproxies.Table;

import java.util.stream.Stream;

public class HavingStream extends OrderByStream {
    protected HavingStream(SQLStreamData data) {
        super(data);
    }

    public OrderByStream ORDER_BY(Table.Column... columns){
        return ORDER_BY(Stream.of(columns).map(Table.Column::getColumnName).toArray(String[]::new));
    }
    public OrderByStream ORDER_BY(Table.SortedColumn... columns){
        return ORDER_BY(Stream.of(columns).map(Table.SortedColumn::getColumnName).toArray(String[]::new));
    }
    public OrderByStream ORDER_BY(String... columns){
        data.orderBy = "ORDER BY " + String.join(", ", columns);
        return this;
    }
}
