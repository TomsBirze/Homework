package io.codelex.practicalWork.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private static final int MAX_ITEMS = 10;
    private final List<T> items;

    public Basket() {
        items = new ArrayList<>();
    }

    public void addToBasket(T item) {
        if (items.size() >= MAX_ITEMS) {
            throw new BasketFullException("Basket is already full. Cannot add more items.");
        }
        items.add(item);
    }

    public void removeFromBasket() {
        if (items.isEmpty()) {
            throw new BasketEmptyException("Basket is already empty. Cannot remove any items.");
        }
        items.remove(items.size() - 1);
    }

    public int getCurrentItems() {
        return items.size();
    }
}

