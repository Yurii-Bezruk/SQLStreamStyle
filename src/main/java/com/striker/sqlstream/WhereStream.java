package com.striker.sqlstream;

import com.striker.tableproxies.Table;

import java.util.stream.Stream;

public class WhereStream extends GroupByStream {
    protected WhereStream(SQLStreamData data) {
        super(data);
    }

    public GroupByStream GROUP_BY(Table.Column... columns){
        return GROUP_BY(Stream.of(columns).map(Table.Column::getColumnName).toArray(String[]::new));
    }
    public GroupByStream GROUP_BY(Table.OrderableColumn... columns){
        return GROUP_BY(Stream.of(columns).map(Table.OrderableColumn::getColumnName).toArray(String[]::new));
    }
    public GroupByStream GROUP_BY(String... columns){
        data.groupBy = "GROUP BY " + String.join(", ", columns);
        return this;
    }
}
