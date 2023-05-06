package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input first variable: ");
        int firstVariable = input.nextInt();
        System.out.println("input secound variable: ");
        int secoundVariable = input.nextInt();
        System.out.println("input third variable: ");
        int thirdVariable = input.nextInt();
        System.out.println("The sum of you variables is : " + (firstVariable + secoundVariable + thirdVariable));
    }
}
