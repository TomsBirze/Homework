package io.codelex.practicalWork.basket;

public class BasketEmptyException extends RuntimeException {
    public BasketEmptyException(String message) {
        super(message);
    }
}
