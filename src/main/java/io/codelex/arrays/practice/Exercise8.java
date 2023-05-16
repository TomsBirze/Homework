package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise8 {
    private static final String[] WORDS = {"apple", "banana", "cherry", "orange", "pear"};
    private static final int MAX_TRIES = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToGuess = getRandomWord();
        char[] guessedLetters = new char[wordToGuess.length()];
        int numTries = 0;

        // Initialize guessed letters array to underscores
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        while (numTries < MAX_TRIES && !isWordGuessed(guessedLetters)) {
            System.out.println("Guess a letter:");
            char letter = scanner.next().charAt(0);

            if (!updateGuessedLetters(letter, wordToGuess, guessedLetters)) {
                numTries++;
            }

            System.out.println("Word: " + String.valueOf(guessedLetters));
            System.out.println("Tries left: " + (MAX_TRIES - numTries));
        }

        if (isWordGuessed(guessedLetters)) {
            System.out.println("Congratulations! You guessed the word.");
        } else {
            System.out.println("Sorry, you ran out of tries. The word was " + wordToGuess);
        }
    }

    // This can be used to get a random Index from a ray be it string, int, or other.
    private static String getRandomWord() {
        int randomIndex = (int) (Math.random() * WORDS.length);
        return WORDS[randomIndex];
    }

    private static boolean updateGuessedLetters(char letter, String wordToGuess, char[] guessedLetters) {
        boolean foundLetter = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter) {
                guessedLetters[i] = letter;
                foundLetter = true;
            }
        }
        return foundLetter;
    }

    private static boolean isWordGuessed(char[] guessedLetters) {
        for (char c : guessedLetters) {
            if (c == '_') {
                return false;
            }
        }
        return true;

    }
}
