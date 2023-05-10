package io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        boolean rollAgain = true;

        while (rollAgain) {
            int roll = (int) (Math.random() * 6) + 1;
            System.out.println("You rolled a " + roll + "!");
            if (roll == 1) {
                System.out.println("You got 0 points.");
                score = 0;
                rollAgain = false;
            } else {
                score += roll;
                System.out.println("Your score is now " + score + ".");
                System.out.print("Roll again? (yes/no) ");
                String input = scanner.next();
                if (input.equals("no")) {
                    rollAgain = false;
                }
            }

            System.out.println("Final score: " + score + ".");
        }
    }
}
