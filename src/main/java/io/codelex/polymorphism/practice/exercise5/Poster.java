package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private String dimensions;
    private int copies;
    private double costPerCopy;

    public Poster(String dimensions, int copies, double costPerCopy) {
        this.dimensions = dimensions;
        this.copies = copies;
        this.costPerCopy = costPerCopy;
    }

    public Poster(int fee, String dimensions, int copies, double costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.copies = copies;
        this.costPerCopy = costPerCopy;
    }

    public String toString() {
        return super.toString() + " dimensions=" + dimensions + " copies=" + copies + " costPerCopy=" + costPerCopy;
    }
}
