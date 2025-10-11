package com.biswa.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int SIZE = sc.nextInt();
        int []arr= new int[SIZE];

        System.out.println("Enter Values:");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }


        System.out.println(arr.length);
        arr[1]=10;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
    }
}