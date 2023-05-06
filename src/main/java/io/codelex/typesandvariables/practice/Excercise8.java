package io.codelex.typesandvariables.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Excercise8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input minutes: ");
        long minutes = input.nextLong();
        long howManyDays = minutes / 60 / 24;
        long howManyYears = howManyDays / 365;
        System.out.println("That's how many days it is: " + howManyDays);
        System.out.println("That's how many years it is: " + howManyYears);
    }
}


