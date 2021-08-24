package com.my.sqlstream;


import com.my.tableproxies.Table;

import java.util.stream.Stream;

public class WhereStream extends GroupByStream {
    protected WhereStream(SQLStreamData data) {
        super(data);
    }

    public GroupByStream GROUP_BY(Table.Column... columns){
        return GROUP_BY(Stream.of(columns).map(Table.Column::getColumnName).toArray(String[]::new));
    }
    public GroupByStream GROUP_BY(Table.SortedColumn... columns){
        return GROUP_BY(Stream.of(columns).map(Table.SortedColumn::getColumnName).toArray(String[]::new));
    }
    public GroupByStream GROUP_BY(String... columns){
        data.groupBy = "GROUP BY " + String.join(", ", columns);
        return this;
    }
}
