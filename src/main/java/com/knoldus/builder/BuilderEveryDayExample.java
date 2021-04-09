package com.knoldus.builder;

public class BuilderEveryDayExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("This is an example");
        builder.append(" of the builder pattern");
        builder.append(" It has methods to append");
        builder.append(" for everything related to string");
        builder.append(42);
        System.out.println(builder.toString());
    }
}
