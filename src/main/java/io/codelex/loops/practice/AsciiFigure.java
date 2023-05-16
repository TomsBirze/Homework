package io.codelex.loops.practice;

public class AsciiFigure {
    private final int size;

    public AsciiFigure(int size) {
        this.size = size;
    }

    public void draw() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < size - i) {
                    System.out.print("/");
                } else {
                    System.out.print("*");
                }
            }
            for (int k = 0; k < size; k++) {
                if (k < size - i) {
                    System.out.print("\\");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AsciiFigure figure = new AsciiFigure(7);
        figure.draw();
    }
}
