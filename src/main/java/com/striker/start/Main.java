package com.striker.start;

import com.striker.sqlstream.SQLStream;

import java.util.List;
import java.util.Map;
import static com.striker.tableproxies.Tables.*;

public class Main {
    public static void main(String[] args) {
        List<Map<String, Object>> result;
        SQLStream stream = SQLStream
                .SELECT(user_with_dep.name, department.name, country.name)
                .FROM(user_with_dep)
                .RIGHT_JOIN(department)
                .ON("user_with_dep.department = department.id")
                .RIGHT_JOIN(country)
                .ON("department.country = country.id")
                .WHERE("country.id > 1")
                .GROUP_BY(country.name.ASC())
                .ORDER_BY(department.name.DESC(), country.name.ASC());
        System.out.println(stream.toFormattedString());
        result = stream.execute();
        result.forEach(System.out::println);
    }
}
