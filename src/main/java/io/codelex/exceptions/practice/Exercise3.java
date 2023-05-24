package io.codelex.exceptions.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Exercise3 {
    public static void cat(File file) {

        //TODO - fix this method so it compiles
        BufferedReader input = null;
        String line = null;

        try {
            input = new BufferedReader(new FileReader("r"));
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O Exception");
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("I/O Exception");
                }
            }
        }
    }
}
