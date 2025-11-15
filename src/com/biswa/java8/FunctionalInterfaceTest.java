package com.biswa.java8;

@FunctionalInterface
interface MyInterface {
    void add();

    private static void log(String msg) {//It is introduced in JDK9
        System.out.println("Log->" + msg);
    }

    static  void show() {
        log("Log Print....");
    }
}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

        //To access the method of functional interface we can use lambda function
        MyInterface my = () -> System.out.println("Hi");
        my.add();
        MyInterface.show();

    }
}
