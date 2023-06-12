package io.codelex.classesandobjects.practice.Exercise9;

public class SwapPoint {
    private int x;
    private int y;

    public SwapPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void swapPointsMethod() {
        int temp = x;
        x = y;
        y = temp;
    }

    @Override
    public String toString() {
        return "SwapPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
