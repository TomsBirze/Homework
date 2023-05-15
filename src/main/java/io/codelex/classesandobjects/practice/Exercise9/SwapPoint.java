package io.codelex.classesandobjects.practice.Exercise9;

public class SwapPoint {
    private int x;
    private int y;

    public SwapPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public int SwapPointsMethod() {
//        int temp = x;
//        x = y;
//        y = temp;
//        return SwapPointsMethod();
//    }

    @Override
    public String toString() {
        return "SwapPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
