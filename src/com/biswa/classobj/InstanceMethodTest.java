package com.biswa.classobj;

class InstanceMethod {
    int a;//instance variable
    static int b;

    void show() {//instance Method
        System.out.println("Instance Method Called.." + a + " " + b);
    }
}

public class InstanceMethodTest {
    public static void main(String[] args) {
        InstanceMethod i = new InstanceMethod();
        i.a = 10;
        InstanceMethod.b = 20;
        i.show();
    }
}
