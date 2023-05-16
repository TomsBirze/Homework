package io.codelex.classesandobjects.practice.Exercie8;

import java.util.Scanner;

public class SavingsAccounts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much money is in the account?: ");
        double startingBalance = input.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        double annualInterest = input.nextDouble();
        System.out.println("How long has the account been opened?: ");
        int accountAge = input.nextInt();

        SavingsAccount account = new SavingsAccount(startingBalance, annualInterest, accountAge);

        double totalDeposits = 0;
        double totalWithdrawals = 0;
        double totalInterest = 0;

        for (int i = 1; i <= accountAge; i++) {
            System.out.println("Enter amount deposited for month " + i + ": ");
            double deposit = input.nextDouble();
            account.setDeposit(deposit);
            totalDeposits += deposit;

            System.out.println("Enter amount withdrawn for month " + i + ": ");
            double withdrawal = input.nextDouble();
            account.setWithdrawal(withdrawal);
            totalWithdrawals += withdrawal;

            double monthlyInterest = account.monthlyInterest();
            double interestEarned = account.monthlyInterestToBalance();
            totalInterest += interestEarned;
            account.setDeposit(interestEarned);

            System.out.printf("Balance after month %d: $%,.2f\n", i, account.accountWithdrawal() + account.accountDeposit() + interestEarned);
        }

//        double endingBalance = account.accountWithdrawal() + account.accountDeposit();
        double endingBalance = startingBalance - account.accountWithdrawal() + account.accountDeposit();
        System.out.printf("Total deposited: $%,.2f\n", totalDeposits);
        System.out.printf("Total withdrawn: $%,.2f\n", totalWithdrawals);
        System.out.printf("Interest earned: $%,.2f\n", totalInterest);
        System.out.printf("Ending balance: $%,.2f\n", endingBalance + totalInterest);
    }
}

