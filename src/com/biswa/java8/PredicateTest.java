package com.biswa.java8;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> {
            return n > 0 ? true : false;
        };

        String s = predicate.test(10) ? "Positive" : "Negative";
        System.out.println(s);


        Predicate<Integer> predicate1 = n -> {
            if (n > 0) return true;
            else return false;
        };

        if (predicate1.test(10)) System.out.println("Positive");
        else System.out.println("Negative");
    }
}
