package com.biswa.exception;

public class TestingFinally {
    public static void main(String[] args) {
        String msg = "Hello";

        try {
            System.out.println("-File Opened-");
            //Logic that contains file opening...
            System.out.println(5 / 0);

        } catch (ArithmeticException e) {
            System.out.println("Exception Occures." + e);
            System.out.println("Exception Occures12." + e.getMessage());
            e.printStackTrace();

        } finally {
            System.out.println(msg);
            System.out.println("-File Closed-");
        }
    }
}
