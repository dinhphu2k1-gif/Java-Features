package org.example.sealed;

public non-sealed class Triangle extends Shape {
    public void print() {
        super.print();
        System.out.println("I'm Triangle");
    }
}
