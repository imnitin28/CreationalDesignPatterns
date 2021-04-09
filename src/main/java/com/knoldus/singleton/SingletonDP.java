package com.knoldus.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonDP {
    /***
     * creating an instance which will be used.
     */
    //private static SingletonDP instance = new SingletonDP(); //this implies this is eagerly loaded.
    private static volatile SingletonDP instance = null; //this implies lazily loaded-- volatile says it is thread safe
    private static volatile Connection conn = null;
    /***
     * people can't create new instances.
     */
    private SingletonDP() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(instance != null)
            throw new RuntimeException("Use getInstance() method to create");
    }

    /***
     * singleton have to be a getInstance method
     * @return
     */
    public static SingletonDP getInstance() {
        if(instance == null) {
            synchronized (SingletonDP.class) { //synchronized block for thread safety
                if(instance == null)
                    instance = new SingletonDP();
            }
        }
        return instance;
    }
    public Connection getConn() {
        if(conn == null) {
            synchronized (SingletonDP.class) {
                if(conn == null) {
                    try {
                        String dbURL = "jdbc:derby:memory:codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbURL);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
