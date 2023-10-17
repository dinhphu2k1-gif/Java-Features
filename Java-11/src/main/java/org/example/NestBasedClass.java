package org.example;

public class NestBasedClass {
    public static class InnerA {
        public void printName() {
            InnerB objB = new InnerB();
            objB.printName();
        }
    }

    public static class InnerB {
        // private!!!
        private void printName() {
            System.out.println("I'm InnerB!");
        }
    }

    public static void main(String[] args) {
        InnerA obj = new InnerA();
        obj.printName();
    }
}
