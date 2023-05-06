package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int checkIntegral = input.nextInt();
        int randomNumber = (int) (Math.random() * 100) + 1;

        boolean numberGuessed = (checkIntegral == randomNumber);
        boolean numberToLow = (checkIntegral < randomNumber);
        boolean numberToHigh = (checkIntegral > randomNumber);

        if (numberGuessed) {
            System.out.println("You guessed it!  What are the odds?!?");
        }
        if (numberToLow) {
            System.out.println("Sorry, you are too low.  I was thinking of " + randomNumber + ".");
        } else if (numberToHigh) {
            System.out.println("Sorry, you are too high.  I was thinking of " + randomNumber + ".");
        }
    }
}
