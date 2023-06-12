package io.codelex.classesandobjects.practice;

public class MoneyTransfers {
    public static void main(String[] args) {
        Account accountA = new Account("name A", 100);
        Account accountB = new Account("name B", 0);
        Account accountC = new Account("name C", 0);

        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);

        Account.transfer(accountA, accountB, 50);
        Account.transfer(accountB, accountC, 25);

        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }
}