package com.biswa.collection;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountTest {
    public static void main(String[] args) {
        String s = "aabaccddb";
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch))
                map.put(ch, 1);
            else
                map.put(ch, map.get(ch) + 1);
        }
        System.out.println(map);
    }
}
