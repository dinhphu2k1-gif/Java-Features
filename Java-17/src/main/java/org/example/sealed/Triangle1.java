package org.example.sealed;

public class Triangle1 extends Triangle{
    public void print() {
        super.print();
        System.out.println("I'm Subclass1");
    }

    public static void main(String[] args) {
        Triangle1 subClass1 = new Triangle1();
        subClass1.print();
    }
}
