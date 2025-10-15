package com.biswa.classobj;

class Employee {
    private int id;
    private String name;
    private float salary;
    private Employee e1;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(Employee e1) {
        this(e1.getId(), e1.getName(), e1.getSalary());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

public class GetterSetterTest {
    public static void main(String[] args) {

    }
}
