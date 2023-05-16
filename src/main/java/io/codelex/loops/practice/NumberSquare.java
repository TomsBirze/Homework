package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Min? ");
        int minInteger = input.nextInt();
        System.out.print("Max? ");
        int maxInteger = input.nextInt();

        for (int i = 0; i < maxInteger; i++) {
            for (int j = i; j < i + maxInteger; j++) {
                int num = (j % maxInteger) + minInteger;
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
