package org.example;

public class OuterClass {
    public static class InnerA {
        // InnerA access InnerB private method, via reflection!
        // Before Java 11 - IllegalAccessException
        // Java 11 - OK
        public void printName(){
            InnerB obj = new InnerB();
            obj.printName();
        }
    }

    public static class InnerB {
        // private!!!
        private void printName() {
            System.out.println("I'm InnerB!");
        }
    }

    public static void main(String[] args){
        InnerA obj = new InnerA();
        obj.printName();
    }
}
