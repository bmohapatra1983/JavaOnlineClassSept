package com.biswa.classobj;

class Fact {
    int findFact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        return f;
    }
}

public class FactorailTest {
    public static void main(String[] args) {
        Fact fact = new Fact();
        int result = fact.findFact(5);
        System.out.println(result);
    }
}
