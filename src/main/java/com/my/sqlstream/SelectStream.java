package com.my.sqlstream;

import java.util.List;
import java.util.Map;

public class SelectStream extends SQLStream {

    public FromStream from(String table){
        data.from.append(table);
        return new FromStream(data);
    }

    @Override
    @Deprecated
    public List<Map<String, Object>> execute() {
        throw new UnsupportedOperationException("cannot execute SQL statement with only SELECT part");
    }
}
