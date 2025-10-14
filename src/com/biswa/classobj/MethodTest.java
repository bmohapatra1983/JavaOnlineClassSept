package com.biswa.classobj;

class Method {
    void add() {
        System.out.println("add:" + (10 + 20));
    }

    void add(int a, int b) {
        System.out.println("add +->" + (a + b));
    }

    int sub() {
        return 10 - 2;
    }

    double mul(int a, int b) {
        return a * 2.0;
    }
}

public class MethodTest {
    public static void main(String[] args) {

        Method m1 = new Method();
        m1.add();
        m1.add(10, 20);
        int res = m1.sub();
        System.out.println("res ->" + res);

        System.out.println(m1.mul(2, 3));

    }
}
