package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class StorageHouseTest {
    @Test
    public void testAddMoreItems() {
        StorageHouse<String> storageHouse = new StorageHouse<>("First Item");
        storageHouse.addMoreItems("Second Item");
        storageHouse.addMoreItems("Third Item");

        Assertions.assertEquals(3, storageHouse.getItems().size());
    }

    @Test
    public void testGetMaybeFirstItem() {
        StorageHouse<Integer> storageHouse = new StorageHouse<>(10);
        Optional<Integer> maybeFirstItem = storageHouse.getMaybeFirstItem();

        Assertions.assertTrue(maybeFirstItem.isPresent());
        Assertions.assertEquals(10, maybeFirstItem.get());
    }

}
