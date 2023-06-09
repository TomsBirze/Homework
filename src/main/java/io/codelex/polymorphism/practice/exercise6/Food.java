package io.codelex.polymorphism.practice.exercise6;

abstract public class Food {

    private int quantity;

    protected Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
