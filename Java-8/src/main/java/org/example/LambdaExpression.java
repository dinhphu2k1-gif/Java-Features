package org.example;

public class LambdaExpression {
    private void before() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi");
            }};
        new Thread(runnable).start();
    }

    private void after() {
        new Thread(() -> System.out.println("Hi")).start();
    }

}
