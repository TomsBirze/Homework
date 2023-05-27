package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }


    @Override
    public int getArea(int width, int height) {
        return (width * height) / 2;
    }

    @Override
    public int getPerimeter(int width, int height) {
        return (width * 2) + height;
    }
}
