package io.codelex.oop.AbtractShape;

public class TriangleTwo extends AbstractShape {

    private double side1;
    private double side2;
    private double side3;

    public TriangleTwo(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

