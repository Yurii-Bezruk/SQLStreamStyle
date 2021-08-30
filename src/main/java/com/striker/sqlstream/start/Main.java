package com.striker.sqlstream.start;

import com.striker.sqlstream.stream.SQLStream;

import static com.striker.sqlstream.help.Functions.*;
import static com.striker.sqlstream.tableproxies.Tables.*;
import static com.striker.sqlstream.help.SelectOptions.*;

public class Main {
    public static void main(String[] args) {
        SQLStream stream = SQLStream
                .SELECT(HIGH_PRIORITY.ALL.SQL_BIG_RESULT.STRAIGHT_JOIN.SQL_BUFFER_RESULT.SQL_SMALL_RESULT,
                        user_with_dep.name.AS("j"), ABS(department.name))
                .FROM(user_with_dep)
                .STRAIGHT_JOIN(department)
                .ON(user_with_dep.department.equalTo(department.id))
                .ORDER_BY(user_with_dep.name);
        System.out.println(stream.toFormattedString());
        System.out.println(stream.execute());

    }
}
