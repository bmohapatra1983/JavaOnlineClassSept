package com.biswa.classobj;

public class CopyConstructureTest {
    public static void main(String[] args) {
        Employee e1= new Employee(1,"Biswa",20000);

        Employee e2= new Employee(e1);

        System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary());
        System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getSalary());
    }
}
