package io.codelex.classesandobjects.practice.Exercise9;

public class SwapPoints {
    public static void main(String[] args) {

        SwapPoint p1 = new SwapPoint(5, 2);
        SwapPoint p2 = new SwapPoint(-3, 6);


        System.out.println(p1);
        System.out.println(p2);

        p1.swapPointsMethod();
        p2.swapPointsMethod();

        System.out.println(p1);
        System.out.println(p2);
    }
}
