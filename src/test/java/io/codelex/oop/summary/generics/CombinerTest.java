package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static io.codelex.oop.summary.generics.Combiner.combineTwoItems;

public class CombinerTest {

    @Test
    public void testCombineTwoItems() {

        Integer first = 10;
        BigDecimal second = new BigDecimal("20.5");

        String expected = "First item: " + first.toString() + "; Second item: " + second.toString();
        String result = combineTwoItems(first, second);

        Assertions.assertEquals(expected, result);
    }
}
