package org.example;

public class SwitchExpressions {

    public void before() {
        String result = "";
        String day = "";
        switch (day) {
            case "M":
            case "W":
            case "F": {
                result = "MWF";
                break;
            }
            case "T":
            case "TH":
            case "S": {
                result = "TTS";
                break;
            }
        };

        System.out.println("Old Switch Result:");
        System.out.println(result);
    }

    public void after() {
        String day = "";
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> "default";
        };

        System.out.println(result);
    }
}
