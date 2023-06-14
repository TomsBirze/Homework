package io.codelex.practicalWork.creditCards;

import java.math.BigDecimal;

abstract public class Card {
    protected int number;
    protected String owner;
    protected String CCV;
    protected BigDecimal balance;

    public Card(int number, String owner, String CCV, BigDecimal balance) {
        this.number = number;
        this.owner = owner;
        this.CCV = CCV;
        this.balance = balance;
    }

    public void addMoney(BigDecimal money) {
        balance = balance.add(money);
        if (shouldPrintWarning()) {
            printWarning();
        }
    }

    public void takeMoney(BigDecimal money) throws NotEnoughFundsException {
        if (balance.compareTo(money) < 0) {
            throw new NotEnoughFundsException("Not enough funds to take out: " + money);
        }
        balance = balance.subtract(money);
        if (shouldPrintWarning()) {
            printWarning();
        }
    }

    protected abstract boolean shouldPrintWarning();

    protected abstract void printWarning();

    static class NotEnoughFundsException extends Exception {
        public NotEnoughFundsException(String message) {
            super(message);
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", owner='" + owner + '\'' +
                ", CCV='" + CCV + '\'' +
                ", balance=" + balance +
                '}';
    }
}
