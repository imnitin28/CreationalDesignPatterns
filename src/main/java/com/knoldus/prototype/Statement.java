package com.knoldus.prototype;

import java.util.List;

public class Statement implements Cloneable{
    private String sql;
    private List<String> parameterList;
    private Record record;

    public Statement(String sql, List<String> parameterList, Record record) {
        this.sql = sql;
        this.parameterList = parameterList;
        this.record = record;
    }
     public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
     }

    public String getSql() {
        return sql;
    }

    public List<String> getParameterList() {
        return parameterList;
    }

    public Record getRecord() {
        return record;
    }
}
