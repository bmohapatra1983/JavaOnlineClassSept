package com.biswa.classobj;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "SJ", 80);
        Student s2 = new Student(2, "DSS", 90);
        s1.display();
        s2.display();


        Student res = getHighestMark(s1, s2);
        System.out.println("--Result--");
        res.display();
        System.out.println(res.mark);
    }

    static Student getHighestMark(Student n1, Student n2) {// Called Function
        if (n1.mark > n2.mark)
            return n1;
        else
            return n2;
    }
}
