package io.codelex.arithmetic.practice;

public class Exercie8 {

    private static final double MIN_WAGE_MA = 8.00;
    private static final int MAX_HOURS = 60;
    private static final double OVERTIME_RATE = 1.5;

    public static void calculatePay(double basePay, int hoursWorked) {
        if (basePay < MIN_WAGE_MA) {
            System.out.println("Error: Base pay is less than the minimum wage.");
            return;
        }
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked is greater than the maximum allowed.");
            return;
        }

        double regularPay = 0;
        double overtimePay = 0;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * basePay;
        } else {
            regularPay = 40 * basePay;
            int overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * basePay * OVERTIME_RATE;
        }

        double totalPay = regularPay + overtimePay;

        System.out.println("Total pay: $" + String.format("%.2f", totalPay));
    }

    public static void main(String[] args) {
        // Calculate pay for Employee 1
        calculatePay(7.50, 35);

        // Calculate pay for Employee 2
        calculatePay(8.20, 47);

        // Calculate pay for Employee 3
        calculatePay(10.00, 73);
    }
}
