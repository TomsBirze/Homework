package io.codelex.classesandobjects.practice;

public class FirstMoneyTransfer {
    public static void main(String[] args) {
        Account mattAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);

        System.out.println(mattAccount);
        System.out.println(myAccount);

        mattAccount.withdrawal(100);
        myAccount.deposit(100);
        
        System.out.println(mattAccount);
        System.out.println(myAccount);
    }
}
//    Your first money transfer
//    Create a program that:
//
//        Creates an account named "Matt's account" with the balance of 1000
//        Creates an account named "My account" with the balance of 0
//        Withdraws 100.0 from Matt's account
//        Deposits 100.0 to My account
//        Prints both accounts