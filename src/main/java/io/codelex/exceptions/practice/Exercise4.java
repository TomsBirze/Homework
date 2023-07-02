package io.codelex.exceptions.practice;

public class Exercise4 {
    public static void main(String[] args) {
        double input = -37;
        try {
            double d = getInput(input);

            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } catch (NonPositiveNumberException e) {
            System.out.println("Result will be imaginary number. Cuz the number is negative.");

        }

    }

    static double getInput(double input) throws NonPositiveNumberException {
        if (input < 0) {
            throw new NonPositiveNumberException();
        }
        return input;
    }

    static class NonPositiveNumberException extends Exception {
        // Not a positive number.
    }
}

