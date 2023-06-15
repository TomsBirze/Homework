package io.codelex.practicalWork.creditCards;

public class NotEnoughFundsException extends Exception {
    public NotEnoughFundsException(String message) {
        super(message);
    }
}