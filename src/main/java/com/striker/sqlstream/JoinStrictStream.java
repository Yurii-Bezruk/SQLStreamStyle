package com.striker.sqlstream;

public class JoinStrictStream {
    protected SQLStream.SQLStreamData data;

    protected JoinStrictStream(SQLStream.SQLStreamData data) {
        this.data = data;
    }

    //TODO polymorphic calls to ON
    public FromStream ON(String onStatement){
        data.from.append(" ON ").append(onStatement);
        return new FromStream(data);
    }
}
