package com.biswa.classobj;

import java.util.Scanner;

class Number {
    int n;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        n = sc.nextInt();
    }

    void findFact() {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        System.out.println("Factorial of " + n + " = " + fact);
    }

    void findSum() {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + i;
        System.out.println("Summation of " + n + " = " + sum);
    }
}

public class NumberTest {
    public static void main(String[] args) {
        Number n1 = new Number();
        n1.getData();
        n1.findFact();
        n1.findSum();
    }
}
