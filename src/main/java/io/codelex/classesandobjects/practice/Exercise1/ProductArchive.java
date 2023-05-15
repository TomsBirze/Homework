package io.codelex.classesandobjects.practice.Exercise1;

public class ProductArchive {
    private String name;
    private double price;
    private int amount;

    public ProductArchive(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void productInfo() {
        System.out.println(name + ", " + String.format("%.2f", price) + "EUR, " + amount + " units.");
    }


}
