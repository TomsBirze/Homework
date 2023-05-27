package io.codelex.oop.shapes;

public abstract class Shape {
    private final int numSides;


    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract int getArea(int width, int height);

    public abstract int getPerimeter(int width, int height);

}
