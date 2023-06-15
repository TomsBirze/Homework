package io.codelex.practicalWork.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReaderAndSaver {

    private static final String PATH_TO_APP = "C:\\03-2023-Projects\\Homework\\src\\main\\java\\io\\codelex\\practicalWork\\";

    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream(PATH_TO_APP + "Java_advanced_tests.txt");
             FileOutputStream out = new FileOutputStream(PATH_TO_APP + "reversed_Java_advanced_tests.txt")) {

            int data;
            StringBuilder content = new StringBuilder();
            while ((data = in.read()) != -1) {
                content.append((char) data);
            }

            String reversedContent = content.reverse().toString();
            out.write(reversedContent.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
