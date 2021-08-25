package com.striker.start;

import com.striker.sqlstream.SQLStream;

import java.util.List;
import java.util.Map;

import static com.striker.tableproxies.Tables.*;


public class Main {
    public static void main(String[] args) {
        List<Map<String, Object>> result;
        SQLStream stream = SQLStream
                .SELECT("*")
                .FROM(user_with_dep, department)
                .JOIN(country)
                .WHERE("user_with_dep.id > 1")
                .ORDER_BY(department.name.DESC());
        System.out.println(stream.toFormattedString());
        result = stream.execute();
        result.forEach(System.out::println);
        TableMapper.map();
    }
}
