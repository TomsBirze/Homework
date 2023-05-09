package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();
        long tenBill = 10000000000L;


        if (n < 0) {
            n *= -1;
        }

        if (n >= tenBill) {
            System.out.println("Number is greater or equals 10,000,000,000!");
        } else {
            int digits = 0;
            while (n != 0) {
                n /= 10;
                digits++;
            }
            System.out.println("Number of digits in the number: " + digits);
        }
    }

}
