package io.codelex.enums.practice;

import java.util.Random;

public enum StonePaperScissor {

    STONE,
    PAPER,
    SCISSOR;

    private static final Random random = new Random();

    public static StonePaperScissor userChoice(String userChoiceString) {
        StonePaperScissor userChoice;
        switch (userChoiceString) {
            case "s" -> userChoice = StonePaperScissor.SCISSOR;
            case "p" -> userChoice = StonePaperScissor.PAPER;
            case "t" -> userChoice = StonePaperScissor.STONE;
            default -> {
                System.out.println("Invalid choice. Please try again.");
                userChoice = null;
            }
        }
        return userChoice;
    }

    public static StonePaperScissor computerChoice() {
        return StonePaperScissor.values()[random.nextInt(3)];
    }
}
