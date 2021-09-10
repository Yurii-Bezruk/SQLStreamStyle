package com.striker.sqlstream.start;

import com.striker.sqlstream.stream.SQLStream;

import static com.striker.sqlstream.help.Functions.*;
import static com.striker.sqlstream.tableproxies.Tables.*;
import static com.striker.sqlstream.help.SelectOptions.*;

public class Main {
    public static void main(String[] args) {
        SQLStream stream = SQLStream
                .SELECT(ALL.SQL_BIG_RESULT.HIGH_PRIORITY.SQL_BUFFER_RESULT.SQL_SMALL_RESULT.STRAIGHT_JOIN,
                        user_with_dep.name.AS("j"), ABS(department.name))
                .FROM(user_with_dep)
                .STRAIGHT_JOIN(department)
                .ON(user_with_dep.department.equalTo(department.id))
                .WHERE(user_with_dep.id);
        System.out.println(stream.toFormattedString());
        System.out.println(stream.execute());
    }
}
