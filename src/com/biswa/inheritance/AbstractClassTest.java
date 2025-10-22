package com.biswa.inheritance;

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void sound();

    void show() {
        System.out.println("In Show.");
    }
}

class Dog extends Animal {
    Dog() {
        super("Desi");
    }

    void sound() {
        System.out.println("Bark..");
    }
}

public class AbstractClassTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.show();
    }
}
