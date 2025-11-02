package com.biswa.exception;

public class ThrowExample {

    static void divide(int a, int b) {
        if (b != 0) {
            int div = a / b;
            System.out.println(div);
        } else {
            throw new ArithmeticException("Enter non-zero value.");
        }
    }

    public static void main(String[] args) {
        divide(5, 0);
    }
}
