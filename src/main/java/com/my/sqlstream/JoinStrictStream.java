package com.my.sqlstream;

public class JoinStrictStream {
    protected SQLStream.SQLStreamData data;

    protected JoinStrictStream(SQLStream.SQLStreamData data) {
        this.data = data;
    }

    public FromStream ON(String onStatement){
        data.from.append(" ON ").append(onStatement);
        return new FromStream(data);
    }
}
