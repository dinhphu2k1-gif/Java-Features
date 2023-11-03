package org.example.sealed;

public sealed class Shape permits Circle, Rectangle, Triangle {
    public void print() {
        System.out.println("I'm Shape");
    }
}

