package com.biswa.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer[], Integer> function = arr -> {
            int large = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > large) large = arr[i];
            }
            return large;
        };

        Integer[] arr = {1, 2, 3, 4, 44, 5};
        Integer result = function.apply(arr);
        System.out.println(result);

        Integer[] arr1 = {1, 2, 3, 4, 44, 5};
        List<Integer> list = Arrays.stream(arr1)
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(list);
    }
}
