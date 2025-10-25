package com.biswa.string;

import java.util.Locale;

public class StringMethodsTest {
    public static void main(String[] args) {
        String s = "hello";
        String n = "hello";
        String s1 = "Hello";
        String s2 = null;
        //1 Find the Length of String
        int l = s.length();
        System.out.println(l);
        //2 Check the string is empty or Not?
        System.out.println(s.isEmpty());
        System.out.println(s1.isEmpty());
        //System.out.println(s2.isEmpty());
        //System.out.println(">>"+s2.isBlank());

        //3 equals
        System.out.println("s->n: " + s.equals(n));
        System.out.println("s->s1: " + s.equals(s1));
        System.out.println("s->s1: " + s.equalsIgnoreCase(s1));

        // To Capital and Small
        System.out.println(s.toUpperCase());
        System.out.println(s1.toLowerCase());

        // Find out the Substring of  a String
        String msg = "This is String,class Object.";
        System.out.println(msg.substring(5));
        System.out.println(msg.substring(5, 10));

        //charAt(index)- To find the character of the specified index
        System.out.println(msg.charAt(10));

        //Split()
        String []msgs = msg.split(",");
        for(String m:msgs){
            System.out.println(m);
        }

        System.out.println(s.repeat(5));
        String mobile = "  99988338838     ";
        System.out.println(mobile.trim());// Remove space before and After of String
        System.out.println(mobile.stripLeading());// Remove space before String
        System.out.println(mobile.stripTrailing());// Remove space after String

    }
}
