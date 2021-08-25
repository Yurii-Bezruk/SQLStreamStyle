package com.striker.sqlstream;

import com.striker.tableproxies.Table;

import java.util.List;
import java.util.Map;
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
    public List<Map<String, Object>> execute() {
        throw new UnsupportedOperationException("cannot execute SQL statement with only SELECT part");
    }
}
