package io.codelex.oop.summary.generics.ordersAndInvoices;

import java.time.Instant;
import java.time.LocalDate;

public class FoodItem extends AbstractItem {
    private LocalDate dateOfExpiration;

    public FoodItem(String name, Double price, LocalDate dateOfExpiration) {
        super(name, price);
        this.dateOfExpiration = dateOfExpiration;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR, best before: " + dateOfExpiration;
    }

    public LocalDate getExpirationDate() {
        return dateOfExpiration;
    }
}
