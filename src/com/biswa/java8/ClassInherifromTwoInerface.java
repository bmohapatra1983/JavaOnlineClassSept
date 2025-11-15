package com.biswa.java8;


//Dimond problem in interface
interface Interface1 {
    default void show() {
        System.out.println("I am in Interface1..");
    }
}

interface Interface2 {
    default void show() {
        System.out.println("I am in Interface2..");
    }
}

class Class1 implements Interface1, Interface2 {

    @Override
    public void show() {
        System.out.println("This is Overridden method..");
        Interface1.super.show();
        Interface2.super.show();
    }
}

public class ClassInherifromTwoInerface {
    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.show();
    }
}
