package com.biswa.collection;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(null);
        list.add(1);
        list.add(null);
        list.add(2);
        list.add(1);
        list.add(null);
        list.add(4);
        list.add(null);
        list.add(1);
        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(1);
        set.add(null);
        set.add(1);
        set.add(-1);
        set.add(4);
        set.add(null);
        set.add(1);
        set.add(null);
        System.out.println(set);

        Set<Employee> employeeSet = new HashSet<>();

        Employee e1 = new Employee(1, "Suvrajeet", 20000);
        employeeSet.add(new Employee(5, "Biswaranjan", 10000));

        Employee e2 = new Employee(2, "Debashis", 21000);
        Employee e5 = new Employee(2, "Debashis", 21000);
        Employee e6 = new Employee(10, "Debashis", 21000);

        Employee e3 = new Employee(3, "Biswajeet", 25000);
        employeeSet.add(new Employee(5, "Biswaranjan", 10000));

        System.out.println(e2);
        System.out.println(e5);

        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e5);
        employeeSet.add(e6);

        for(Employee employee :employeeSet){
            System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getSalary());
        }

        System.out.println("Find the Highest Salary of Employee-");
        double highestSalary = 0;
        for(Employee employee :employeeSet){
            if(employee.getSalary()>highestSalary){
                highestSalary = employee.getSalary();
            }
        }
        System.out.println("Highest Salary: "+highestSalary);

        // Find the common elements form 2 Set
        List<Integer> list1 = Arrays.asList(1,2,3,4,7);
        //List<Integer> list2 = Arrays.asList(1,4,8,41,7);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 4, 8, 41, 7));

        System.out.println(list2.retainAll(list1));
        System.out.println(list2);
    }
}
