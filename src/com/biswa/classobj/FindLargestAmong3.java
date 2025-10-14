package com.biswa.classobj;

import java.util.Scanner;

class Numbers {

    int findLarge(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }
}

public class FindLargestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Numbers ns = new Numbers();
        int biggest = ns.findLarge(a, b, c);
        System.out.println(biggest);
    }
}
