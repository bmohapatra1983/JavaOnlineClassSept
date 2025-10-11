package com.biswa.classobj;

public class ProductMain {
    public static void main(String[] args) {
        Product p1;//Object declaration
        p1 = new Product();// Object creation
        p1.show();

        p1.id=1;
        p1.name="Mobile";
        p1.price=3000;
        p1.show();
    }
}
