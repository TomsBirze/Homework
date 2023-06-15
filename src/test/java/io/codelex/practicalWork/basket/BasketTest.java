package io.codelex.practicalWork.basket;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BasketTest {
    @Test
    public void testAddToBasket() {
        Basket<Apple> applesBasket = new Basket<>();

        for (int i = 0; i < 10; i++) {
            applesBasket.addToBasket(new Apple());
            assertEquals(i + 1, applesBasket.getCurrentItems(), "Number of items should increase by 1");
        }

        assertThrows(BasketFullException.class, () -> applesBasket.addToBasket(new Apple()), "Adding to a full basket should throw BasketFullException");
    }

    @Test
    public void testRemoveFromBasket() {
        Basket<Apple> applesBasket = new Basket<>();

        assertThrows(BasketEmptyException.class, applesBasket::removeFromBasket, "Removing from an empty basket should throw BasketEmptyException");

        for (int i = 0; i < 10; i++) {
            applesBasket.addToBasket(new Apple());
        }

        for (int i = 9; i >= 0; i--) {
            applesBasket.removeFromBasket();
            assertEquals(i, applesBasket.getCurrentItems(), "Number of items should decrease by 1");
        }
    }
}