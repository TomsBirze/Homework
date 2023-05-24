package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class SPCGame {
    public static void main(String[] args) {

        System.out.println("Let us begin...");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int yourScore = 0;
        int myScore = 0;
        int weTied = 0;
        int nrOfGames = 0;

        System.out.println("Stone paper scissor");
        while (true) {
            // Get user's choice
            System.out.print("Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String userChoiceString = scanner.nextLine().toLowerCase();

            // Quit if 'q' is entered
            if (userChoiceString.equals("q")) {
                break;
            }
            StonePaperScissor userChoice;
            switch (userChoiceString) {
                case "s" -> userChoice = StonePaperScissor.SCISSOR;
                case "p" -> userChoice = StonePaperScissor.PAPER;
                case "t" -> userChoice = StonePaperScissor.STONE;
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }
            }

            // Generate computer's choice
            StonePaperScissor computerChoice = StonePaperScissor.values()[random.nextInt(3)];
            // Print choices
            System.out.println("My turn: " + computerChoice);

            if (userChoice == computerChoice) {
                weTied++;
                nrOfGames++;
                System.out.println("Tie!");
            } else if (userChoice == StonePaperScissor.SCISSOR && computerChoice == StonePaperScissor.PAPER
                    || userChoice == StonePaperScissor.PAPER && computerChoice == StonePaperScissor.STONE
                    || userChoice == StonePaperScissor.STONE && computerChoice == StonePaperScissor.SCISSOR) {
                yourScore++;
                nrOfGames++;
                System.out.println("You won!");
            } else {
                myScore++;
                nrOfGames++;
                System.out.println("I won!");
            }

            System.out.println();
        }
        System.out.println("Thank you for playing Stone Paper Scissor game!");
        System.out.println("Games played: " + nrOfGames);
        System.out.println("You won: " + yourScore);
        System.out.println("I won: " + myScore);
        System.out.println("Games we tied: " + weTied);

    }
}
