package com.knoldus.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Collectors;

public class SingletonDPDemo {
    public static void main(String[] args) {
        SingletonDP singletonDP = SingletonDP.getInstance();
        /***
         * want to verify if it is singleton? let's do it by creating new Instance
         * SingletonDP singletonDP1 = new SingletonDP(); -- this throws error.
         */
//        SingletonDP anotherInstance = SingletonDP.getInstance();
//        if(singletonDP == anotherInstance)
//            System.out.println("Verified singleton Design pattern");
//        System.out.println(singletonDP);
        long timeBefore = 0;
        long timeAfter = 0;

        System.out.println(singletonDP);
        timeBefore = System.currentTimeMillis();
        Connection conn = singletonDP.getConn();
        timeAfter = System.currentTimeMillis();
        System.out.println((timeAfter - timeBefore) + " milliseconds taken to create table");
        Statement statement;
        try {
            statement = conn.createStatement();
            int count = statement
                    .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
                     + " City VARCHAR(20))");
            System.out.println("Table created");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        timeBefore = System.currentTimeMillis();
        conn = singletonDP.getConn();
        timeAfter = System.currentTimeMillis();
        System.out.println((timeAfter - timeBefore) + " millis Connection already exist" );
    }
}
