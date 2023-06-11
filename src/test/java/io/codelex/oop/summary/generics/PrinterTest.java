package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

public class PrinterTest {


    @Test
    public void testPrintString() {
        String text = "Hello, world!";
        Printer<String> printer = new Printer<>(text);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        printer.print();

        System.setOut(originalOut);

        String printedText = outContent.toString().trim();

        Assertions.assertEquals(text, printedText);

    }

    @Test
    public void testPrintInteger() {
        Integer number = 10;
        Printer<Integer> printer = new Printer<>(number);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        printer.print();

        System.setOut(originalOut);

        String printedText = outContent.toString().trim();

        Assertions.assertEquals(number.toString(), printedText);
    }

    @Test
    public void testPrintBigDecimal() {
        BigDecimal decimal = new BigDecimal("20.5");
        Printer<BigDecimal> printer = new Printer<>(new BigDecimal(String.valueOf(decimal)));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        printer.print();

        System.setOut(originalOut);

        String printedText = outContent.toString().trim();

        Assertions.assertEquals(decimal.toString(), printedText);
    }
}
