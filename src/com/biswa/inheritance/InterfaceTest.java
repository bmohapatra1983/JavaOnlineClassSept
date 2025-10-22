package com.biswa.inheritance;

interface Circle {
    float PI = 3.14F;

    void calculate();
}

class Area implements Circle {

    int r = 2;

    public void calculate() {
        System.out.println("Area = " + 2 * PI * r);
    }
}


public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Circle.PI);
        Circle circle = new Area();
        circle.calculate();
    }
}
