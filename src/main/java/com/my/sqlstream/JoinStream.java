package com.my.sqlstream;

public class JoinStream extends FromStream {
    protected JoinStream(SQLStreamData data) {
        super(data);
    }

    public FromStream ON(String onStatement){
        data.from.append(" ON ").append(onStatement);
        return new FromStream(data);
    }
}
