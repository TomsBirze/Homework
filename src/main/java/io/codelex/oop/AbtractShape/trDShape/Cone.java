package io.codelex.oop.AbtractShape.trDShape;

public class Cone extends trDShape {
    private double radius;
    private double length;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }

    public double calculateArea() {
        return Math.PI * radius * (radius + calculateLength());
    }

    public double calculateVolume() {
        return ((double) 1 / 3) * Math.PI * (radius * radius) * height;
    }
}
