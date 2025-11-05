package com.biswa.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeListTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee(1, "Suvrajeet", 20000);
        employeeList.add(new Employee(5, "Biswaranjan", 10000));
        Employee e2 = new Employee(2, "Debashis", 21000);
        Employee e3 = new Employee(3, "Biswajeet", 25000);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        System.out.println(employeeList);

        for (Employee emp : employeeList) {
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
        }

        System.out.println("--Print salary > 20000--");
        for (Employee emp : employeeList) {
            if (emp.getSalary() > 20000)
                System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
        }

        //Iterate the data from the list using Iterator
        System.out.println("--Using Iterator--");
        Iterator<Employee> itr = employeeList.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            if (emp.getSalary() > 20000)
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
        }

        //Using Java8
        System.out.println("--Using Java8--");
        employeeList.forEach(emp ->
                System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary())
        );

        System.out.println("--Print salary > 20000-- using java8");
        employeeList.stream().filter(emp->
                emp.getSalary()>20000).forEach(e->
                System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary())
        );
    }
}
