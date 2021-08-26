package com.striker.sqlstream.start;

import com.striker.sqlstream.stream.SQLStream;

import static com.striker.sqlstream.tableproxies.Tables.*;
import static com.striker.sqlstream.help.SelectOptions.*;

public class Main {
    public static void main(String[] args) {
        SQLStream stream = SQLStream
                .SELECT(STRAIGHT_JOIN.ALL, user_with_dep.name, department.name)
                .FROM(user_with_dep)
                .STRAIGHT_JOIN(department)
                .ON("user_with_dep.department = department.id");
        System.out.println(stream.execute());
        System.out.println(stream.toFormattedString());
    }
}
