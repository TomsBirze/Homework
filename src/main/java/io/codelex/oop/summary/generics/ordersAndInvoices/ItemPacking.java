package io.codelex.oop.summary.generics.ordersAndInvoices;

public class ItemPacking implements Service {

    static final String NAME = "Item packing";
    static final double PRICE = 5.00;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getFullInfo() {
        return NAME + ", " + PRICE + " EUR";
    }
}
