package io.codelex.quizz;

import java.io.IOException;
import java.util.Scanner;

import static io.codelex.quizz.Trivia.randomFactQuestion;

public class TriviaApp {
    public static void main(String[] args) {
        int correctAnswers = 0;
        int triviaCount = 0;

        try {
            AnswerOptions answerOptions;
            Scanner scanner = new Scanner(System.in);

            while (triviaCount < 20) {
                String[] randomData = Trivia.random();
                String randomFact = randomData[0];
                String extractedNumber = randomData[1];
                answerOptions = new AnswerOptions(extractedNumber);

                System.out.println("Question: " + randomFactQuestion());
                System.out.println("Answer Options:");
                System.out.println("a: " + answerOptions.getOptionA());
                System.out.println("b: " + answerOptions.getOptionB());
                System.out.println("c: " + answerOptions.getOptionC());
                System.out.println("d: " + answerOptions.getOptionD());

                System.out.print("Enter your answer (a, b, c, d): ");
                String userInput = scanner.nextLine();

                switch (userInput) {
                    case "a" -> {
                        String optionA = answerOptions.getOptionA();
                        if (optionA.equalsIgnoreCase(extractedNumber)) {
                            System.out.println("Correct answer");
                            correctAnswers++;
                        } else {
                            System.out.println("Wrong answer. It was " + extractedNumber);
                            printResult(triviaCount, correctAnswers);
                            return;
                        }
                    }
                    case "b" -> {
                        String optionB = answerOptions.getOptionB();
                        if (optionB.equalsIgnoreCase(extractedNumber)) {
                            System.out.println("Correct answer");
                            correctAnswers++;
                        } else {
                            System.out.println("Wrong answer. It was " + extractedNumber);
                            printResult(triviaCount, correctAnswers);
                            return;
                        }
                    }
                    case "c" -> {
                        String optionC = answerOptions.getOptionC();
                        if (optionC.equalsIgnoreCase(extractedNumber)) {
                            System.out.println("Correct answer");
                            correctAnswers++;
                        } else {
                            System.out.println("Wrong answer. It was " + extractedNumber);
                            printResult(triviaCount, correctAnswers);
                            return;
                        }
                    }
                    case "d" -> {
                        String optionD = answerOptions.getOptionD();
                        if (optionD.equalsIgnoreCase(extractedNumber)) {
                            System.out.println("Correct answer");
                            correctAnswers++;
                        } else {
                            System.out.println("Wrong answer. It was " + extractedNumber);
                            printResult(triviaCount, correctAnswers);
                            return;
                        }
                    }
                    default -> {
                        System.out.println("Invalid answer option.");
                        printResult(triviaCount, correctAnswers);
                        return;
                    }
                }
                triviaCount++;
            }

            printResult(triviaCount, correctAnswers);
        } catch (IOException e) {
            System.out.println("An error occurred while retrieving the random fact: " + e.getMessage());
        }
    }

    private static void printResult(int triviaCount, int correctAnswers) {
        System.out.println("Trivia Questions Answered: " + triviaCount + " out of 20.");
        System.out.println("Correct Answers: " + correctAnswers);
    }
}
