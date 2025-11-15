package com.biswa.java8;

interface A {
    void add();//abstract method

    default void show() {//default method
        System.out.println("I am in default..");
    }

    static void display() {// static method
        System.out.println("I am in static..");
    }
}

class B implements A {
    public void add() {
        System.out.println("I am in add()..");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        B obj = new B();
        obj.add();//call abstract method
        obj.show();//call default method
        A.display();//call static method
    }
}
