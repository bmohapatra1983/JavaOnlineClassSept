package com.biswa.fundamental;

public class IfElseTest {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
            System.out.println("hi");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }


        // if if if else
        if(5!=2) {
            System.out.println("1");
            System.out.println("hi");
        }
        if(5!=3) {
            System.out.println("2");
            System.out.println("hello");
        }

        if(5==4)
            System.out.println("3");
        else
            System.out.println("NA");

        // if else-if else-if else
        System.out.println("-------------------");
        if(5==2) {
            System.out.println("1");
            System.out.println("hi");
        }
        else if(5!=3) {
            System.out.println("2");
            System.out.println("hello");
        }

        else if(5==4)
            System.out.println("3");
        else
            System.out.println("NA");
    }
}
