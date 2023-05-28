package io.codelex.oop.summary.generics.ordersAndInvoices;

public class HouseholdItem extends AbstractItem {
    private String color;

    public HouseholdItem(String name, Double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR, color: " + color;
    }
}
