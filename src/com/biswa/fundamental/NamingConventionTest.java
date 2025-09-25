package com.biswa.fundamental;

public class NamingConventionTest {

    void add123(){
        float PI = 3.14F;
    }
    void findArea(int r){
        final float PI = 3.14F;
        System.out.println("Area: "+PI * r * r);
    }

    public static void main(String[] args) {
        int a;
        int b;
        int _a123;
        int _123;
        // int 1a; // Invalid variable name, commented out
    }
}