package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriodTest {

    public static void main(String[] args) {

        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);

        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);


        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);

        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod intersectionPeriod = firstPeriod.intersection(secondPeriod);

        if (intersectionPeriod != null) {
            System.out.println("Intersection Period:");
            System.out.println("Start Date: " + intersectionPeriod.getStart());
            System.out.println("End Date: " + intersectionPeriod.getEnd());
        } else {
            System.out.println("The periods do not intersect.");
        }
    }
}
