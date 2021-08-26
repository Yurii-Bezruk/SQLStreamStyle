package com.striker.sqlstream.stream;

import com.striker.sqlstream.help.ResultSet;
import com.striker.sqlstream.tableproxies.Table;

import java.util.stream.Stream;

public class SelectStream extends SQLStream {

    public FromStream FROM(Table... tables){
        return FROM(Stream.of(tables).map(Table::getTableName).toArray(String[]::new));
    }
    public FromStream FROM(String... tables){
        data.from.append(String.join(", ", tables));
        return new FromStream(data);
    }

    @Override
    @Deprecated
    public ResultSet execute() {
        throw new UnsupportedOperationException("cannot execute SQL statement with only SELECT part");
    }
}
