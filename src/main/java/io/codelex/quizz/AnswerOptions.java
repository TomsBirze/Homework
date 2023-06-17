package io.codelex.quizz;

import java.util.Random;

public class AnswerOptions {
    private final String extractedNumber;
    private final Random random;

    public AnswerOptions(String extractedNumber) {
        this.extractedNumber = extractedNumber;
        this.random = new Random();
    }

    public String getOptionA() {
        return generateRandomNumber(extractedNumber.length());
    }

    public String getOptionB() {
        return extractedNumber;
    }

    public String getOptionC() {
        return generateRandomNumber(extractedNumber.length());
    }

    public String getOptionD() {
        return generateRandomNumber(extractedNumber.length());
    }

    private String generateRandomNumber(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

//    private String generateRandomNumber(int length) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            int digit = random.nextInt(10); // Generate random digit (0-9)
//            builder.append(digit);
//        }
//        return builder.toString();
//    }
}
