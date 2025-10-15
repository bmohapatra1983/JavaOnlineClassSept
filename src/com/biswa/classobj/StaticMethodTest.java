package com.biswa.classobj;

class StaticMethod {
    static int a = 10;

    static void a(){
        System.out.println("I am in a..");
    }
    static void display() {
        System.out.println("Hi.."+a);
        a();
    }
}

public class StaticMethodTest {
    public static void main(String[] args) {
        StaticMethod.display();
    }
}
