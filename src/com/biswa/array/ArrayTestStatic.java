package com.biswa.array;

import java.util.Arrays;

public class ArrayTestStatic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));

        arr[3] = 200;
        System.out.println(Arrays.toString(arr));

        //How to iterate the values from the array
        //1 Traditional way
        System.out.println("Values:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //2 new
        System.out.println("new :");
        for(int n:arr){
            System.out.println(n);
        }

        //Q WAL that will print even numbers only from the array
        System.out.println("--Even Print--");
        for(int n:arr){
            if(n%2==0)
                System.out.println(n);
        }

    }
}
