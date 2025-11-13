package com.biswa.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 120);
        map.put(null, 129);
        map.put("B", 121);
        map.put("C", 122);
        map.put("D", 123);
        map.put(null, 128);
        System.out.println(map);

        System.out.println(map.get("C"));

        //? How to iterate the data from a map
        //1- using  advanced for
        System.out.println("-Using for-");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //2- Using iterator
        System.out.println("-Using Iterator-");
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> data = itr.next();
            System.out.println(data.getKey() + " " + data.getValue());
        }

        //3 - Using Java8 and most recomonded
        System.out.println("-Using Java8");
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
