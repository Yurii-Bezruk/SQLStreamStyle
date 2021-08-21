package com.my.start;
import com.my.sqlstream.SQLStream;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Map<String, Object>> result;
        SQLStream stream = SQLStream
                .select("user_with_dep.name", "department.name", "country.name")
                .from("user_with_dep")
                .rightJoin("department")
                .on("user_with_dep.department = department.id")
                .rightJoin("country")
                .on("department.country = country.id")
                .where("country.id > 1")
                .groupBy("country.name")
                .orderBy("department.name")
                .asc()
                .limit(2)
                .offset(1);
        System.out.println(stream);
        result = stream.execute();
        result.forEach(System.out::println);
    }
}
