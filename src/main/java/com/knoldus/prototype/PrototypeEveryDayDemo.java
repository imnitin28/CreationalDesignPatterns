package com.knoldus.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEveryDayDemo {
    public static void main(String[] args) {
        String sql = "select * from movies where title= ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star wars");
        Record record = new Record();

        Statement firstStatement = new Statement(sql,parameters,record);
        System.out.println(firstStatement.getParameterList());
        System.out.println(firstStatement.getRecord());
        Statement secondStatement = firstStatement.clone();
        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameterList());
        System.out.println(secondStatement.getRecord());
    }
}
