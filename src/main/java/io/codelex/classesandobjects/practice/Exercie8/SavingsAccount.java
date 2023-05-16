package io.codelex.classesandobjects.practice.Exercie8;

public class SavingsAccount {
    private double startingBalance;
    private double deposit;
    private double withdrawal;
    private double annualInterest;
    private int accountAge;

    public SavingsAccount(double startingBalance, double annualInterest, int accountAge) {
        this.startingBalance = startingBalance;
        this.annualInterest = annualInterest;
        this.accountAge = accountAge;
    }

    public double accountWithdrawal() {
        double accountWithdrawal = startingBalance - withdrawal;
        return accountWithdrawal;
    }

    public double accountDeposit() {
        double accountDeposit = startingBalance + deposit;
        return accountDeposit;
    }

    public double monthlyInterest() {
        double monthlyInterest = annualInterest / 12;
        return monthlyInterest;
    }

    public double monthlyInterestToBalance() {
        double monthlyInterestCalculation = monthlyInterest() * deposit;
        double monthlyInterestToBalance = monthlyInterestCalculation + deposit;
        return monthlyInterestToBalance;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setWithdrawal(double withdrawal) {
        this.withdrawal = withdrawal;
    }

}
