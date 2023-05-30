package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number to find out if its happy.");
        int number = scanner.nextInt();

        boolean isHappy = isHappyNumber(number);
        if (isHappy) {
            System.out.println("It's a happy number!");
        } else {
            System.out.println("It's not a happy number.");
        }
    }

    private static boolean isHappyNumber(int number) {
        List<Integer> numberList = new ArrayList<>();

        while (number != 1 && !numberList.contains(number)) {
            numberList.add(number);
            number = squareAndSumDigits(number);
        }

        return number == 1;
    }

    private static int squareAndSumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return sum;
    }
}
