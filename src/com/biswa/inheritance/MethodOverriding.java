package com.biswa.inheritance;

class Class1 {
    void show() {
        System.out.println("show in Class1");
    }
}

class Class2 extends Class1 {
    void show() {
        System.out.println("show in Class2");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Class2 c2 = new Class2();
        c2.show();
    }
}
