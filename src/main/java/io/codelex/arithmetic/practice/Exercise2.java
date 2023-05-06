package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input first integer: ");
        int checkIntegral = input.nextInt();

        boolean isIntegralOdd = checkIntegral % 2 == 1;

        if (isIntegralOdd) {
            System.out.println("Integral is Odd.");
        } else {
            System.out.println("Integral is Even.");
        }
        System.out.println("bye!");
    }

}


