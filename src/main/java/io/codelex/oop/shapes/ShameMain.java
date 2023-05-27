package io.codelex.oop.shapes;

public class ShameMain {
    public static void main(String[] args) {


        Shape firstTriangle = new Triangle(3, 5, 10);
        Shape firstRectangle = new Rectangle(4, 5, 10);

        System.out.println("area is " + firstTriangle.getArea(5, 10));
        System.out.println("perimeter is " + firstTriangle.getPerimeter(5, 10));
        System.out.println("area is " + firstRectangle.getArea(5, 10));
        System.out.println("perimeter is " + firstRectangle.getPerimeter(5, 10));

    }
}
