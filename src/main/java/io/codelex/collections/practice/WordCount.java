package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(WordCount.class.getResource(file).getPath());
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        for (String line : Files.readAllLines(path, charset)) {
            lineCount++;
            charCount += line.length();
            wordCount += countWords(line);
        }

        System.out.println("Lines = " + lineCount);
        System.out.println("Words = " + wordCount);
        System.out.println("Chars = " + charCount);
    }

    private static int countWords(String line) {
        boolean inWord = false;
        int wordCount = 0;

        for (char c : line.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (!inWord) {
                    inWord = true;
                    wordCount++;
                }
            } else {
                inWord = false;
            }
        }

        return wordCount;
    }
}
