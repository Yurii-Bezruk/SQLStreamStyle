package com.striker.sqlstream;

public class JoinStream extends FromStream {
    protected JoinStream(SQLStreamData data) {
        super(data);
    }

    //TODO polymorphic calls to ON
    public FromStream ON(String onStatement){
        data.from.append(" ON ").append(onStatement);
        return new FromStream(data);
    }
}
