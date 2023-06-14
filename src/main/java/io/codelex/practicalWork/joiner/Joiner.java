package io.codelex.practicalWork.joiner;

import java.util.List;
import java.util.stream.Collectors;

public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> elements) {
        return elements.stream()
                .map(Object::toString)
                .collect(Collectors.joining(separator));
    }
}
