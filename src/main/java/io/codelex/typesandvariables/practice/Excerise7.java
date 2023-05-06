package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Excerise7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String line = input.nextLine();
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i))) {
                count++;
            }
        }

        System.out.println("The number of uppercase letters is: " + count);
    }
}
