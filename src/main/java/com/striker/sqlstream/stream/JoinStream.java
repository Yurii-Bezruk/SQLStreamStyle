package com.striker.sqlstream.stream;

import com.striker.sqlstream.tableproxies.Table;

public class JoinStream extends FromStream {
    protected JoinStream(SQLStreamData data) {
        super(data);
    }

    //TODO polymorphic calls to ON
    public FromStream ON(String onStatement){
        data.from.append(" ON ").append(onStatement);
        return new FromStream(data);
    }
    public JoinConditionStream ON(Table.Column column){
        data.from.append(" ON ").append(column.getColumnName());
        return new JoinConditionStream(data);
    }
}
