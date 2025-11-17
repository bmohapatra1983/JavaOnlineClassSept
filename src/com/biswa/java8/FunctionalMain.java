package com.biswa.java8;

import java.util.function.Consumer;

public class FunctionalMain {
    public static void main(String[] args) {
        MyFunctionalInterface my = () -> {
            System.out.println("Hi");
            System.out.println("Hello");
        };
        my.show();

        //2
        FunctionalInterfaceParameter fip = (a, b) -> System.out.println(a + b);

        fip.add(10, 20);

        //3 Single Parameter
        FunctionalSingleParameter sp = s -> System.out.println("Hello->" + s);

        sp.show("Biswaranjan");

        //4 Parameter with return type.
        FunctionalWithParameterAndReturn par = (p, q) -> p - q;
        int result = par.sub(100, 20);
        System.out.println(result);

        //Consumer Demo
        Consumer<String> c = name -> System.out.println("Hello->" + name);
        c.accept("Biswa");
    }
}
