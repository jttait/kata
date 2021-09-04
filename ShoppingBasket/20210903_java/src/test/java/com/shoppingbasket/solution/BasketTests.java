package com.shoppingbasket.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BasketTests {

    @Test
    void addProductToBasket() {
        Basket basket = new Basket();
        basket.addProduct(new Product("beans", new Money("1.50")));
        List<Product> expected = Arrays.asList(new Product("beans", new Money("1.50")));
        Assertions.assertEquals(expected, basket.getProducts());
    }

}
