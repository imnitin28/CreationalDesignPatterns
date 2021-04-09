package com.knoldus.singleton;

public class SingletonEveryDayExample {
    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        System.out.println(singletonRuntime);
        Runtime anotherRuntime = Runtime.getRuntime();
        System.out.println(anotherRuntime);
        if(singletonRuntime == anotherRuntime)
            System.out.println("They are same instance");
    }
}
