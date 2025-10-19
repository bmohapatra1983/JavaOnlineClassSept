package com.biswa.inheritance;

class A {//Parent
    int a = 10;

    void show() {
        System.out.println(a);
    }
}

class B extends A{//Child
    int b = 20;

    void add() {
        System.out.println(b + a);
    }
}

class C extends B{

}


public class InheritanceTest {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.add();
    }
}
