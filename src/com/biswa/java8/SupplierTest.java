package com.biswa.java8;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello";
        String s = supplier.get();
        System.out.println(s);

        //2
        Supplier<Integer> supplier1 = () -> {
            int a = 10;
            int b = 20;
            return a + b;
        };

        System.out.println(supplier1.get());
    }
}
