package io.codelex.classesandobjects.practice;

public class BankAccounts {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Benson", 17.25);
        BankAccount accountTwo = new BankAccount("Benson", -17.50);

        System.out.println(account);
        System.out.println(accountTwo);

        account.withdraw(5);
        accountTwo.deposit(10);

        System.out.println(account);
        System.out.println(accountTwo);
    }
}
