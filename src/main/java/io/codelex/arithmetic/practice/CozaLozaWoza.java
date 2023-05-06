package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        for (int num = 1; num <= 110; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (num % 3 == 0) {
                System.out.print("Coza ");
            } else if (num % 5 == 0) {
                System.out.print("Loza ");
            } else if (num % 7 == 0) {
                System.out.print("Woza ");
            } else {
                System.out.print(num + " ");
            }

            if (num % 11 == 0) {
                System.out.println();
            }
        }
    }
}
