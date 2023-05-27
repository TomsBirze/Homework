package io.codelex.oop.AbtractShape;

import io.codelex.oop.AbtractShape.trDShape.Cone;
import io.codelex.oop.AbtractShape.trDShape.Cube;
import io.codelex.oop.AbtractShape.trDShape.trDShape;

public class AbstractShapeApp {
    public static void main(String[] args) {

        //Exercise9

        AbstractShape triangle = new TriangleTwo(10, 15, 20);
        AbstractShape rectangle = new Rectangle(20, 5);
        AbstractShape hexagon = new Hexagon(8);

        System.out.println("The perimeter of this triangle is: " + triangle.calculatePerimeter()
                + " and the area is: " + triangle.calculateArea());
        System.out.println("The perimeter of this rectangle is: " + rectangle.calculatePerimeter()
                + " and the area is: " + rectangle.calculateArea());
        System.out.println("The perimeter of this hexagon is: " + hexagon.calculatePerimeter()
                + " and the area is: " + hexagon.calculateArea());


        //Exercise10


        trDShape cone = new Cone(10, 20);
        trDShape cube = new Cube(8);

        double coneVolume = cone.calculateVolume();
        double cubeVolume = cube.calculateVolume();


        System.out.println("The perimeter of this cone is: " + cone.calculatePerimeter()
                + " and the area is: " + cone.calculateArea() + ", the volume is: " + coneVolume);
        System.out.println("The perimeter of this cube is: " + cube.calculatePerimeter()
                + " and the area is: " + cube.calculateArea() + ", the volume is: " + cubeVolume);
    }
}
