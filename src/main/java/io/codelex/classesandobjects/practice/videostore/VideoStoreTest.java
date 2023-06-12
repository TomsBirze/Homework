package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static final VideoStore store = new VideoStore();

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
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard);
                case 2 -> rentVideo(keyboard);
                case 3 -> returnVideo(keyboard);
                default -> {
                }
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String title = scanner.next();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            store.addVideo(new Video(title, rating));
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        Video video = getVideoByTitle(movieName);
        if (video != null) {
            if (video.isCheckedOut()) {
                System.out.println("Sorry, that movie is already checked out");
            } else {
                video.checkedOut();
                System.out.println("You have rented " + movieName);
            }
        } else {
            System.out.println("Sorry, we don't have " + movieName);
        }
        store.printOutInventory();
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        Video video = getVideoByTitle(movieName);
        if (video != null) {
            video.returnVideo();
            System.out.println("You have returned " + movieName);
        } else {
            System.out.println("Sorry, we don't have " + movieName);
        }
        store.printOutInventory();
    }

    private static Video getVideoByTitle(String title) {
        for (Video video : store.getVideos()) {
            if (video.getTitle().equalsIgnoreCase(title)) {
                return video;
            }
        }
        return null;
    }
}