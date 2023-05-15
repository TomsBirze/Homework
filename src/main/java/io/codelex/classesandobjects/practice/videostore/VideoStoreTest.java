package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static ArrayList<Movie> movies = new ArrayList<Movie>();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);


        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            movies.add(new Movie(movieName, rating));
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        for (Movie movie : movies) {
            if (movie.getName().equalsIgnoreCase(movieName)) {
                if (movie.isCheckedOut()) {
                    System.out.println("Sorry, that movie is already checked out");
                } else {
                    movie.setCheckedOut(true);
                    System.out.println("You have rented " + movieName);
                }
                return;
            }
        }
        System.out.println("Sorry, we don't have " + movieName);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        for (Movie movie : movies) {
            if (movie.getName().equalsIgnoreCase(movieName)) {
                if (movie.isCheckedOut()) {
                    movie.setCheckedOut(false);
                    System.out.println("You have returned " + movieName);
                } else {
                    System.out.println("That movie was not rented from this store");
                }
                return;
            }
        }
        System.out.println("Sorry, we don't have " + movieName);
    }
}
