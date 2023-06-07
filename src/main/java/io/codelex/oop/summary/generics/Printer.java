package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Printer<T> {
    private final T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public T getThingToPrint() {
        return thingToPrint;
    }

    public static void main(String[] args) {
        Integer number = 10;
        String text = "Hello, world!";
        BigDecimal decimal = new BigDecimal("20.5");

        Printer<Integer> printer1 = new Printer<>(number);
        printer1.print();

        Printer<String> printer2 = new Printer<>(text);
        printer2.print();

        Printer<BigDecimal> printer3 = new Printer<>(decimal);
        printer3.print();
    }
}
