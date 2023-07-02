package io.codelex.exceptions.practice;

public class Exercise2 {

    private int numerator = 10;
    private int denominator = 0;

    public Exercise2(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static void main(String[] args) {

        Exercise2 first = new Exercise2(20, 0);

        first.methodA();


    }

    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            int result = numerator / denominator;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
