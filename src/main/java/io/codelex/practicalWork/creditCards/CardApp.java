package io.codelex.practicalWork.creditCards;

import java.math.BigDecimal;

public class CardApp {
    public static void main(String[] args) throws NotEnoughFundsException {

        Card cardOne = new CreditCard(5423, "Jhon", "023", BigDecimal.valueOf(2330));
        Card cardTwo = new DebitCard(2313, "Billy", "123", BigDecimal.valueOf(5000));

        System.out.println(cardOne.toString());
        System.out.println(cardTwo.toString());

        cardOne.takeMoney(BigDecimal.valueOf(2300));
        cardTwo.addMoney(BigDecimal.valueOf(6000));

        System.out.println(cardOne.toString());
        System.out.println(cardTwo.toString());

        cardOne.takeMoney(BigDecimal.valueOf(60));
    }
}
