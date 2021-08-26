package com.striker.sqlstream.help;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ResultSet {
    private List<Map<String, Object>> result;

    public ResultSet(List<Map<String, Object>> result) {
        this.result = result;
    }

    public List<Map<String, Object>> getListOfResultRows() {
        return result;
    }

    public Map<String, Object> getResultRow(int rowNumber){
        return result.get(rowNumber);
    }

    public List<Object> getResultColumn(String columnName){
        return result.stream().map(resultRow -> resultRow.get(columnName)).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        getResultRow(0).keySet().forEach(key -> builder.append(key).append("   "));
        builder.append("\n");
        result.forEach(row -> {
            row.forEach((key, value) -> builder.append(value).append("   "));
            builder.append("\n");
        });
        return builder.toString();
    }
}
