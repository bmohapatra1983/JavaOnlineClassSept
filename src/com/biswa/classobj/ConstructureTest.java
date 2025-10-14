package com.biswa.classobj;

class A {
    public A() {
        System.out.println("Hi");
    }

    A(String name) {
        System.out.println("Hello,"+name);
    }

    A(int n){
        System.out.println(n*n);
    }
}

public class ConstructureTest {
    public static void main(String[] args) {
        A obj = new A();
        String name= "";
        A obj1 = new A(name);
        A obj3 = new A(5);
    }
}
