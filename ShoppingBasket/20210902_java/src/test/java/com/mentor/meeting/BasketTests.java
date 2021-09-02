package com.mentor.meeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class BasketTests {

    @Test
    void createBasketWithOneProduct() {
        Basket basket = new Basket();
        basket.addProduct(new Product("apple", BigDecimal.valueOf(2.99)));
        Assertions.assertEquals(BigDecimal.valueOf(2.99), basket.getTotal());
    }

    @Test
    void createBasketWithAnotherProduct() {
        Basket basket = new Basket();
        basket.addProduct(new Product("beans", BigDecimal.valueOf(3.99)));
        Assertions.assertEquals(BigDecimal.valueOf(3.99), basket.getTotal());
    }

    @Test
    void createBasketWithTwoProducts() {
        Basket basket = new Basket();
        basket.addProduct(new Product("apple", BigDecimal.valueOf(2.00)));
        basket.addProduct(new Product("beans", BigDecimal.valueOf(3.00)));
        Assertions.assertEquals(BigDecimal.valueOf(5.00), basket.getTotal());
    }

    @Test
    void getProductsInBasketWithOneProduct() {
        Basket basket = new Basket();
        basket.addProduct(new Product("apple", BigDecimal.valueOf(2.00)));
        List<BasketItem> basketItems = new ArrayList<>();
        basketItems.add(new BasketItem("apple", BigDecimal.valueOf(2.00)));
        Assertions.assertEquals(basketItems, basket.getProducts());
    }

    @Test
    void getProductsInBasketWithTwoProducts() {
        Basket basket = new Basket();
        basket.addProduct(new Product("apple", BigDecimal.valueOf(2.00)));
        basket.addProduct(new Product("apple", BigDecimal.valueOf(2.00)));
        List<BasketItem> basketItems = new ArrayList<>();
        basketItems.add(new BasketItem("apple", BigDecimal.valueOf(2.00)));
        basketItems.add(new BasketItem("apple", BigDecimal.valueOf(2.00)));
        Assertions.assertEquals(basketItems, basket.getProducts());
    }
}
