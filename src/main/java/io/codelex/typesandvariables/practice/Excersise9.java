package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Excersise9 {
    public static void main(String[] args) {
        System.out.println("Test Data");
        Scanner input = new Scanner(System.in);
        System.out.println("Input distance in meters: ");
        int distance = input.nextInt();
        System.out.println("Input hour: ");
        int hour = input.nextInt();
        System.out.println("Input minutes: ");
        int minutes = input.nextInt();
        System.out.println("Input seconds: ");
        int seconds = input.nextInt();

        float distanceInKm = (float) 2500 / 1000;
        int totalTimeInSeconds = (hour * 3600) + (minutes * 60) + seconds;
        float totalTimeInHours = (float) totalTimeInSeconds / 60 / 60;
        float metersPerSecond = (float) distance / totalTimeInSeconds;
        float kiloMetersPerHour = distanceInKm / totalTimeInHours;
        float distanceInMyles = (float) 2500 / 1609;
        float milesPerHour = distanceInMyles / totalTimeInHours;


        System.out.println("Your speed in meters/second is: " + metersPerSecond);
        System.out.println("Your speed in km/h is: " + kiloMetersPerHour);
        System.out.println("Your speed in miles/h is: " + milesPerHour);
    }
}
