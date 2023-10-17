package org.example;

public class StringSwitch {

    private void before() {
        String status ="1";
        if (status.equals("1")) {
            System.out.println(1);
        } else if (status.equals("2")) {
            System.out.println(2);
        } else if (status.equals("3")) {
            System.out.println(3);
        }
    }

    private void after() {
        String status = "1";
        switch (status) {
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
        }
    }
}
