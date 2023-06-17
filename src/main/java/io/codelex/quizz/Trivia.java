package io.codelex.quizz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Trivia {
    protected static final String BASE_URL = "http://numbersapi.com/";


    public static String[] random() throws IOException {
        URL url = new URL(BASE_URL + "random/trivia");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        String fact = response.toString();
        String extractedNumber = extractNumberFromFact(fact);

        return new String[]{fact, extractedNumber};
    }

    private static String extractNumberFromFact(String fact) {
        int numberStartIndex = 0;
        int numberEndIndex = fact.indexOf(" is");

        if (numberEndIndex > numberStartIndex) {
            return fact.substring(numberStartIndex, numberEndIndex);
        }
        return null;
    }

    public static String randomFactQuestion() throws IOException {
        String[] randomData = random();
        String randomFact = randomData[0];
        String extractedNumber = randomData[1];

        return "What" + randomFact.substring(extractedNumber.length() + 1);
    }

}
