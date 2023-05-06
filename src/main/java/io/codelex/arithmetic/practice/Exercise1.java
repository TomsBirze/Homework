package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input first integer: ");
        int firstInteger = input.nextInt();
        System.out.println("input second integer: ");
        int secondInteger = input.nextInt();

        boolean isFirstOrSecondFifteen = (firstInteger == 15 || secondInteger == 15);
        boolean isFirstPlusSecondFifteen = (firstInteger + secondInteger == 15);

        if (isFirstOrSecondFifteen) {
            System.out.println("One or both integers are equal to 15.");
        } else {
            System.out.println("Try again.");
        }
        if (isFirstPlusSecondFifteen) {
            System.out.println("The sum of the integers is 15.");
        } else {
            System.out.println("Try again.");
        }
    }
}
