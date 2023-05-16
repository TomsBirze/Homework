package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    public String toString() {
        String balanceString = String.format("$%.2f", Math.abs(balance));
        if (balance < 0) {
            balanceString = "-" + balanceString;
        }
        return name + ", " + balanceString;
    }
}
