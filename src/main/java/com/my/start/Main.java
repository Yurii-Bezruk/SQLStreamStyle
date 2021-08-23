package com.my.start;
import com.my.sqlstream.SQLStream;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Map<String, Object>> result;
        SQLStream stream = SQLStream
                .SELECT("user_with_dep.name", "department.name", "country.name")
                .FROM("user_with_dep")
                .RIGHT_JOIN("department")
                .ON("user_with_dep.department = department.id")
                .RIGHT_JOIN("country")
                .ON("department.country = country.id")
                .WHERE("country.id > 1")
                .GROUP_BY("country.name")
                .ORDER_BY("department.name")
                .asc()
                .limit(2)
                .offset(1);
        System.out.println(stream);
        result = stream.execute();
        result.forEach(System.out::println);
    }
}
