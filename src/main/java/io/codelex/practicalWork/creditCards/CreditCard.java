package io.codelex.practicalWork.creditCards;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(int number, String owner, String CCV, BigDecimal balance) {
        super(number, owner, CCV, balance);
    }

    @Override
    protected boolean shouldPrintWarning() {
        return getBalance().compareTo(new BigDecimal(100)) < 0;
    }

    @Override
    protected void printWarning() {
        System.out.println("Warning: Low funds");
    }
}
