package io.codelex.practicalWork.percentageOfItems;

import java.util.function.Predicate;
import java.util.List;

public class PercentageCalculator<T> {
    public double partOf(List<T> list, Predicate<T> condition) {
        long count = list.stream().filter(condition).count();
        return (double) count / list.size();
    }
}
