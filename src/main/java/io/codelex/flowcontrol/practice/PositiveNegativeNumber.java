package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PositiveNegativeNumber {

    //TODO: Write a Java program to test a number is positive or negative.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = in.nextInt();

        boolean inoutPositive = input > 0;
        boolean inoutNegative = input < 0;

        if (inoutPositive) {
            System.out.println("Number is positive");
        } else if (inoutNegative) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

    }

}
