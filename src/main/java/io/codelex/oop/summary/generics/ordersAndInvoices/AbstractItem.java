package io.codelex.oop.summary.generics.ordersAndInvoices;

public abstract class AbstractItem implements Item {
    protected String name;
    protected double price;

    public AbstractItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR";
    }
}
