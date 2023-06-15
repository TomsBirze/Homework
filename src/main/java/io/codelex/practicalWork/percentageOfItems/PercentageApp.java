package io.codelex.practicalWork.percentageOfItems;

import java.util.Arrays;
import java.util.List;

public class PercentageApp {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jhonny", "Billy", "Tesa", "Hogwash", "Jakeandbake", "Vanesa", "Tilly");
        PercentageCalculator<String> stringCalculator = new PercentageCalculator<>();
        double percentage = stringCalculator.partOf(names, name -> name.length() > 5);
        System.out.println(percentage);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PercentageCalculator<Integer> intCalculator = new PercentageCalculator<>();
        double percentageTwo = intCalculator.partOf(numbers, (Integer n) -> n % 2 == 1);
        System.out.println(percentageTwo);
    }
}
