package io.codelex.classesandobjects.practice;

public class FirstAccount {
    public static void main(String[] args) {
        Account myFirstAccount = new Account("my account", 100);

        System.out.println("Initial state");
        System.out.println(myFirstAccount);


        myFirstAccount.deposit(20);
        System.out.println("Barto's account balance is now: " + myFirstAccount.balance());


        System.out.println("Final state");
        System.out.println(myFirstAccount);

    }
}
