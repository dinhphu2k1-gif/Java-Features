package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class LocalVariable {
    public static void main(String[] args) {
        var x = 10; // Biến x được suy luận là kiểu int.

        var name = "John"; // Biến name được suy luận là kiểu String.

        var list = new ArrayList<String>(); // Biến list được suy luận là kiểu ArrayList<String>.

        var map = new HashMap<Integer, String>(); // Biến map được suy luận là kiểu HashMap<Integer, String>.
    }

}
