package io.codelex.loops.practice;

import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Desired sum: ");
        int desiredDiceSum = input.nextInt();

        int score;
        boolean rollAgain = true;

        while (rollAgain) {
            int rollOne = (int) ((Math.random() * 6) + 1);
            int rollTwo = (int) ((Math.random() * 6) + 1);
            if (rollOne + rollTwo == desiredDiceSum) {
                System.out.println(rollOne + " + " + rollTwo + " = " + desiredDiceSum);
                rollAgain = false;
            } else {
                score = rollOne + rollTwo;
                System.out.println(rollOne + " + " + rollTwo + " = " + score);
            }
        }
    }
}
