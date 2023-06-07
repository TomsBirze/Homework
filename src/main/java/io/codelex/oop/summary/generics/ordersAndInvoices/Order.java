package io.codelex.oop.summary.generics.ordersAndInvoices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (isBadFood(item)) {
            throw new BadFoodException("Cannot add food item with an expiration date less than today.");
        }
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void getOrderText() {
        System.out.println("Order:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + ", " + item.getPrice() + " EUR");
        }
    }

    public List<Item> getItems() {
        return items;
    }

    private boolean isBadFood(Item item) {
        if (item instanceof FoodItem) {
            FoodItem foodItem = (FoodItem) item;
            LocalDate today = LocalDate.now();
            return foodItem.getExpirationDate().isBefore(today);
        }
        return false;
    }

    public class BadFoodException extends RuntimeException {
        public BadFoodException(String message) {
            super(message);
        }
    }
}
