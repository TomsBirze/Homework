package io.codelex.oop.summary.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StorageHouse<T> {
    private List<T> items = new ArrayList<>();

    public StorageHouse(T firstItem) {
        items.add(firstItem);
    }

    public void addMoreItems(T item) {
        items.add(item);
    }

    public Optional<T> getMaybeFirstItem() {
        return items.stream().findFirst();
    }

    public void printItems() {
        items.forEach(System.out::println);
    }

    public static void main(String[] args) {
        StorageHouse<Integer> integerHouse = new StorageHouse<>(10);
        integerHouse.addMoreItems(20);
        integerHouse.printItems();

        StorageHouse<String> stringHouse = new StorageHouse<>("Hello");
        stringHouse.addMoreItems("World");
        stringHouse.printItems();
    }
}
