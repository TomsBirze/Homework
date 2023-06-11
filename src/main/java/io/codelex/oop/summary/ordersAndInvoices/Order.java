package io.codelex.oop.summary.ordersAndInvoices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<SellableThings> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(SellableThings item) {
        if (isBadFood(item)) {
            throw new BadFoodException("Cannot add food item with an expiration date less than today.");
        }
        items.add(item);
    }

    public void removeItem(SellableThings item) {
        items.remove(item);
    }

    public void getOrderText() {
        System.out.println("Order:");
        for (SellableThings item : items) {
            System.out.println("- " + item.getName() + ", " + item.getPrice() + " EUR");
        }
    }

    public List<SellableThings> getItems() {
        return items;
    }

    private boolean isBadFood(SellableThings item) {
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
