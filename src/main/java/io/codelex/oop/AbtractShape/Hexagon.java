package io.codelex.oop.AbtractShape;

public class Hexagon extends AbstractShape {

    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    public double calculatePerimeter() {
        return 6 * side;
    }

    public double calculateArea() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }

}
