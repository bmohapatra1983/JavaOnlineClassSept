package com.biswa.java8;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer = name -> System.out.println("Hello >" + name);
        consumer.accept("Biswaranjan");

        //
        Integer[] arr = {1, 2, 3, 4, 44, 5};
        Consumer<Integer[]> consumer1 = a -> {
            int large = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] > large) large = a[i];
            }
            System.out.println("Largest = " + large);
        };

        consumer1.accept(arr);
    }
}
