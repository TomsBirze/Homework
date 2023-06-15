package io.codelex.practicalWork.creditCards;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(int number, String owner, String CCV, BigDecimal balance) {
        super(number, owner, CCV, balance);
    }

    @Override
    protected boolean shouldPrintWarning() {
        return getBalance().compareTo(new BigDecimal(10000)) > 0;
    }

    @Override
    protected void printWarning() {
        System.out.println("Warning: Too much money");
    }

}
