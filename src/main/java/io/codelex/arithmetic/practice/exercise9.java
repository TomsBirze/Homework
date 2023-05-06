package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
//        BMI = weight x 703 / height ^ 2
//        BMI is between 18.5 and 25.

        Scanner input = new Scanner(System.in);
        System.out.println("Input your (metric) weight: ");
        int metricWeight = input.nextInt();
        System.out.println("Input your (metric) height: ");
        int metricHeight = input.nextInt();

        double poundWeight = metricWeight * 2.20462;
        double inchHeight = metricHeight * 0.393701;

        double bodyMassIndex = (double) poundWeight * 703 / (inchHeight * inchHeight);

        boolean optimalBMI = (bodyMassIndex > 18.5 && bodyMassIndex < 25);
        boolean lowBMI = (bodyMassIndex < 18.5);
        boolean highBMI = (bodyMassIndex > 25);

        if (optimalBMI) {
            System.out.printf("Yor weight is optimal: %.1f BMI", bodyMassIndex);
        } else if (lowBMI) {
            System.out.printf("Yor underweight: %.1f BMI", bodyMassIndex);
        } else if (highBMI) {
            System.out.printf("Yor overweight: %.1f BMI", bodyMassIndex);
        }
    }
}
