package com.biswa.string;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();//Stack Area in memory

        String name1 = new String("Biswaranjan");// In Heap Area


        char[] a = {'B', 'i', 's', 'w', 'a'};
        String name2 = new String(a);

        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
    }
}
