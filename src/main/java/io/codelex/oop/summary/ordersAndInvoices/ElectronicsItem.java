package io.codelex.oop.summary.ordersAndInvoices;

public class ElectronicsItem extends AbstractItem {
    private String powerInWats;

    public ElectronicsItem(String name, Double price, String powerInWats) {
        super(name, price);
        this.powerInWats = powerInWats;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR, power: " + powerInWats;
    }
}
