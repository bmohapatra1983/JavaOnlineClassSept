package com.biswa.fundamental;
import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Number:");
        int n = sc.nextInt();
        sc.nextLine();
        String name= sc.nextLine();

        System.out.println("You entered: " + n);
        System.out.println("You entered: " + name);


    }
}
