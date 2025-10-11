package com.biswa.fundamental;

public class FibonaciSeries {
    public static void main(String[] args) {

        int count = 20;
        int first = 0;
        int second = 1;
        System.out.print(first+" "+second);
        for(int i=2;i<=count;i++){
            int next = first + second;
            System.out.print(" "+next);
            first=second;
            second=next;
        }
    }
}
