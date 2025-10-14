package com.biswa.classobj;

public class Student {
    int id;
    String name;
    float mark;

    Student(int id, String name, float mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    void display() {
        System.out.println(id + " " + name + " " + mark);
    }

}
