package com.striker.start;

import com.striker.sqlstream.SQLStream;

import java.util.List;
import java.util.Map;

import static com.striker.tableproxies.Tables.*;


public class Main {
    public static void main(String[] args) {
        SQLStream stream = SQLStream
                .SELECT(user_with_dep.name, department.name)
                .FROM(user_with_dep)
                .STRAIGHT_JOIN(department)
                .ON("user_with_dep.department = department.id");
        System.out.println(stream.execute());
        System.out.println(stream.toFormattedString());

    }
}
