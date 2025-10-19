package com.biswa.inheritance;

class P {
    int x = 10;
    void show(){
        System.out.println("I am in P");
    }
}

class C1 extends P {
    int x = 20;
    int y = super.x;
    void show(){
        System.out.println("I am in C1");
        super.show();
    }
}

public class SuperTest {
    public static void main(String[] args) {
        C1 c1= new C1();
        P p1 = new P();
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(p1.x);
        c1.show();
    }
}
