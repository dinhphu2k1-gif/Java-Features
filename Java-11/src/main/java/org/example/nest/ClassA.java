package org.example.nest;

import java.lang.reflect.Field;

public class ClassA {
    static class ChildClassA {
        private String name;

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ClassA.ChildClassA childClassA = new ClassA.ChildClassA();

        Field name = ClassA.ChildClassA.class.getDeclaredField("name");
        name.set(childClassA, "alo");

        System.out.println(childClassA.name);
    }
}
