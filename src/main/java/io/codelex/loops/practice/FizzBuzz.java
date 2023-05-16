package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int enteredInteger = in.nextInt();

        int number = 0;
        for (int i = 1; i <= enteredInteger; i++) {
            if (i % 20 == 0) {
                System.out.println();
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzbuzz ");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            } else System.out.print(i + " ");
        }
    }
}
