package com.biswa.fundamental;

public class OperatorTest {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        //Arithmetic Operators
        System.out.println("a + b = " + (a + b));//7
        System.out.println("a - b = " + (a - b));//3
        System.out.println("a * b = " + (a * b));//10
        System.out.println("b / a = " + (a / b));//2
        System.out.println("b % a = " + (a % b));//1

        //Assignment Operators
        int c = 5;
        c += 3; // c = c + 3
        System.out.println("c += 3: " + c);//8
        c -= 2; // c = c - 2
        System.out.println("c -= 2: " + c);//6
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);//12
        c /= 3; // c = c / 3
        System.out.println("c /= 3: " + c);//4
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c);//1

        //Relational Operators
        System.out.println("a == b: " + (a == b));//false
        System.out.println("a != b: " + (a != b));//true
        System.out.println("a > b: " + (a > b));//true 5>2
        System.out.println("a < b: " + (a < b));//false 5<2
        System.out.println("a >= b: " + (a >= b));//true
        System.out.println("a <= b: " + (a <= b));//false

        //Logical Operators
        System.out.println("(a > b) && (a != b): " + ((a > b) && (a != b)));//true
        System.out.println("(a > b) || (a == b): " + ((a > b) || (a == b)));//true
        System.out.println("!(a > b): " + !(a > b));//false


    }
}
