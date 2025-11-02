package com.biswa.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q. Find the Factorial of odd numbers from the List
public class FindTheFactorialOfOdd {
    static List<Integer> factList = new ArrayList<>();

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> arrList = Arrays.asList(arr);

        for (int n : arrList) {
            if (n % 2 != 0) {
                FindTheFactorialOfOdd.findFact(n);
            }
        }
        System.out.println(factList);
    }

    static void findFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        factList.add(fact);
        System.out.println("Factorail of " + n + " = " + fact);
    }
}
