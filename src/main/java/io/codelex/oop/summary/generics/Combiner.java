package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Combiner {
    public static <T, U> String combineTwoItems(T first, U second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }

    public static void main(String[] args) {
        Integer first = 10;
        BigDecimal second = new BigDecimal("20.5");

        String result = combineTwoItems(first, second);
        System.out.println(result);
    }

}
