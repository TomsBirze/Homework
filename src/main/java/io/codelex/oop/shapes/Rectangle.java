package io.codelex.oop.shapes;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }


    @Override
    public int getArea(int width, int height) {
        return width * height;
    }

    @Override
    public int getPerimeter(int width, int height) {
        return (width + height) * 2;
    }
}
