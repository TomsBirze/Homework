package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        int[] histogram = generateHistogram(scores);
        displayHistogram(histogram);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static int[] generateHistogram(String scores) {
        int[] histogram = new int[11]; // Each index represents a range of 10 (0-9, 10-19, ..., 100)

        Arrays.stream(scores.split("\n"))
                .mapToInt(Integer::parseInt)
                .forEach(score -> {
                    int index = score / 10;
                    histogram[index]++;
                });

        return histogram;
    }

    private static void displayHistogram(int[] histogram) {
        for (int i = 0; i < 10; i++) {
            String range = String.format("%02d-%02d:", i * 10, i * 10 + 9);
            String bar = "*".repeat(histogram[i]);
            System.out.println(range + " " + bar);
        }
        System.out.println("  100: " + "*".repeat(histogram[10]));
    }
}
