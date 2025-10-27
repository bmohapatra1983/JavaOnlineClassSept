package com.biswa.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number: ");

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int div = a / b;//Aritmatic Exception
            System.out.println("Division = " + div);
        } catch (ArithmeticException ex) {
            System.out.println("Invalid Number Entered!(Enter >0)");
        } catch (InputMismatchException ex) {
            System.out.println("only Number Allowed!");
        }
        System.out.println("This is the Last line Msg...");


        try {
            int[] arr = {1, 3, 4};
            System.out.println(arr[5]);//Array Index Out of bounds Exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index!");
        }

        try {
            String name = null;
            System.out.println(name.length());//Null Pointer exception
        } catch (NullPointerException npx) {
            System.out.println("Can not Access Null value");
        }
    }
}
