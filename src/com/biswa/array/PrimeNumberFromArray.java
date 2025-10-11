package com.biswa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberFromArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int []listPrime = new int[10];
        List<Integer> list = new ArrayList<>();

        for (int j = 0; j < numbers.length; j++) {
            int n = numbers[j];
            int listCount=0;
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                listCount++;
            }
            if (isPrime == true){
                listPrime[listCount] = n;
                list.add(n);
            }

        }
        System.out.println(Arrays.toString(listPrime));
        System.out.println(list);

    }
}
