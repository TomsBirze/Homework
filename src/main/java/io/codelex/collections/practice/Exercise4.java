package io.codelex.collections.practice;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single name per line, to stop just pres enter: ");


        Set<String> nameArray = new HashSet<>();

        String input;
        while (true) {
            System.out.println("Enter name: ");
            input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                break;
            }
            nameArray.add(input);
        }
        System.out.println("Unique name list contains: " + nameArray);
    }
}
