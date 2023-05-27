package io.codelex.oop.AbtractShape.trDShape;

public class Cube extends trDShape {

    private double sideEdge;

    public Cube(double sideEdge) {
        this.sideEdge = sideEdge;
    }

    public double calculatePerimeter() {
        return sideEdge * 12;
    }

    public double calculateArea() {
        return 6 * (sideEdge * sideEdge);
    }

    public double calculateVolume() {
        return sideEdge * sideEdge * sideEdge;
    }

}
