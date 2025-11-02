package com.biswa.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindTheFactorialOfOddJava8 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        Arrays.stream(arr)
                .filter(n -> n % 2 != 0)
                .map(FindTheFactorialOfOddJava8::findFact)
                .forEach(System.out::println);
    }

    static int findFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
