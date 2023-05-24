package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {

            try {
                System.out.println("Enter the numerator");
                String numeratorString = scanner.next();
                if (numeratorString.equalsIgnoreCase("q") || numeratorString.equalsIgnoreCase("quit")) {
                    break;
                }
                int numerator = Integer.parseInt(numeratorString);
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);

            } catch (InputMismatchException ime) {
                System.out.println("Please try again");

            } catch (ArithmeticException ae) {
                System.out.println("You cant divide by zero");
            } catch (NumberFormatException nfe) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
            }

        }
    }
}
