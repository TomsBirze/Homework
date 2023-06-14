package io.codelex.joiner;

import io.codelex.practicalWork.joiner.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class JoinerTest {


    @Test
    public void testJoin_withIntegers() {
        Joiner<Integer> joiner = new Joiner<>("-");
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5);
        String expected = "1-2-3-4-5";
        String result = joiner.join(elements);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testJoin_withStrings() {
        Joiner<String> joiner = new Joiner<>("-");
        List<String> elements = Arrays.asList("Hello", "World", "OpenAI");
        String expected = "Hello-World-OpenAI";
        String result = joiner.join(elements);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testJoin_withEmptyList() {
        Joiner<String> joiner = new Joiner<>("-");
        List<String> elements = List.of();
        String expected = "";
        String result = joiner.join(elements);
        Assertions.assertEquals(expected, result);
    }

}
