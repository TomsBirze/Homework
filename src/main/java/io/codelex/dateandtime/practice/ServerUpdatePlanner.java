package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ServerUpdatePlanner {

    public static final int DAYS_BETWEEN_UPDATED = 14;

    public static void main(String[] args) {

        LocalDate serverLaunch = LocalDate.of(2023, 1, 1);

        LocalDate nextUpdate = serverLaunch.plusDays(DAYS_BETWEEN_UPDATED);
        LocalDate subsequentUpdate = nextUpdate.plusDays(DAYS_BETWEEN_UPDATED);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM");

        String nextUpdateFormat = nextUpdate.format(formatter);
        String subsequentUpdateFormat = subsequentUpdate.format(formatter);

        System.out.println("Next update is after " + DAYS_BETWEEN_UPDATED + " days: " + nextUpdateFormat);
        System.out.println("The subsequent update is: " + subsequentUpdateFormat);
    }
}
