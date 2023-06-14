package io.codelex.practicalWork.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private static final int MAX_ITEMS = 10;
    private int currentItems;
    private final List<T> items;

    public Basket() {
        currentItems = 0;
        items = new ArrayList<>();
    }

    public void addToBasket(T item) {
        if (currentItems >= MAX_ITEMS) {
            throw new BasketFullException("Basket is already full. Cannot add more items.");
        }
        items.add(item);
        currentItems++;
    }

    public void removeFromBasket() {
        if (currentItems <= 0) {
            throw new BasketEmptyException("Basket is already empty. Cannot remove any items.");
        }
        items.remove(items.size() - 1);
        currentItems--;
    }

    public int getCurrentItems() {
        return currentItems;
    }
}

