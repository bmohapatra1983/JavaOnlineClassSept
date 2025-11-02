package com.biswa.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> al =  new ArrayList<>();
        al.add(1);
        al.add(4);
        al.add(3);
        al.add(7);
        al.add(5);
        al.add(-1);
        System.out.println(al);

        for(Integer n:al){
            if(n%2==0)
                System.out.println(n);
        }
    }
}
