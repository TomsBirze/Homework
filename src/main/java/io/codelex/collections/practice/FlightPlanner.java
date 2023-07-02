package io.codelex.collections.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";
    private static Map<String, List<String>> flightData;

    public static void main(String[] args) {
        try {
            loadFlightData();
            displayCityList();

            Scanner scanner = new Scanner(System.in);
            System.out.println("To select a city from which you would like to start, enter the corresponding number:");
            int startCityIndex = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            String startCity = getCityByIndex(startCityIndex);
            List<String> route = new ArrayList<>();
            route.add(startCity);

            while (true) {
                List<String> destinations = flightData.get(startCity);
                System.out.println("From " + startCity + ", you can fly directly to:");
                displayCityOptions(destinations);

                System.out.println("Where would you like to go next? Enter the corresponding number or # to exit:");
                String userInput = scanner.nextLine().trim();

                if (userInput.equals("#")) {
                    break;
                }

                int nextCityIndex = Integer.parseInt(userInput);
                String nextCity = getCityByIndex(nextCityIndex);

                route.add(nextCity);

                if (nextCity.equals(startCity)) {
                    printRoute(route);
                    break;
                }

                startCity = nextCity;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private static void loadFlightData() throws IOException {
        final Path path = Paths.get(FlightPlanner.class.getResource(file).getPath());
        flightData = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    String[] cities = line.split("->");
                    String origin = cities[0].trim();
                    String destination = cities[1].trim();

                    flightData.putIfAbsent(origin, new ArrayList<>());
                    flightData.get(origin).add(destination);
                }
            }
        }
    }

    private static void displayCityList() {
        System.out.println("List of cities:");
        int index = 1;
        for (String city : flightData.keySet()) {
            System.out.println(index + ". " + city);
            index++;
        }
    }

    private static void displayCityOptions(List<String> cities) {
        int index = 1;
        for (String city : cities) {
            System.out.println(index + ". " + city);
            index++;
        }
    }

    private static String getCityByIndex(int index) {
        int cityIndex = 1;
        for (String city : flightData.keySet()) {
            if (cityIndex == index) {
                return city;
            }
            cityIndex++;
        }
        return null;
    }

    private static void printRoute(List<String> route) {
        System.out.println("Your round-trip route:");
        for (String city : route) {
            System.out.println(city);
        }
    }
}
