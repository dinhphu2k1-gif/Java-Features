package org.example;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryResources {
    public void oldTry () {
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fos = new FileOutputStream("movies.txt");
            dos = new DataOutputStream(fos);
            dos.writeUTF("Java 7 Block Buster");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                dos.close();
            } catch (IOException e) {
                // log the exception
            }
        }
    }

    public void newTry() {
        try (FileOutputStream fos =
                     new FileOutputStream("movies.txt");
             DataOutputStream dos =
                     new DataOutputStream(fos)) {
            dos.writeUTF("Java 7 Block Buster");
        } catch (IOException e) {
            // log the exception
        }
    }


}
