package com.shoppingbasket.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BasketPricerTests {

    @Test
    void priceBasketWithOneProduct() {
        Basket basket = new Basket();
        basket.addProduct(new Product("beans", new Money("1.50")));
        BasketPricer pricer = new BasketPricer();
        Assertions.assertEquals(new Money("1.50"), pricer.getPriceBeforeDiscounts(basket));
    }

    @Test
    void priceBasketWithTwoDifferentProducts() {
        Basket basket = new Basket();
        basket.addProduct(new Product("beans", new Money("1.50")));
        basket.addProduct(new Product("apple", new Money("2.00")));
        BasketPricer pricer = new BasketPricer();
        Assertions.assertEquals(new Money("3.50"), pricer.getPriceBeforeDiscounts(basket));
    }

    @Test
    void priceBasketWithTwoItemsForBuyOneGetOneFree() {
        Basket basket = new Basket();
        basket.addProduct(new Product("beans", new Money("1.50")));
        basket.addProduct(new Product("beans", new Money("1.50")));
        List<Offer> offers = Arrays.asList(new BuyOneGetOneFreeOffer("beans"));
        BasketPricer pricer = new BasketPricer(offers);
        Assertions.assertEquals(new Money("1.50"), pricer.getPriceAfterDiscounts(basket));
    }

    @Test
    void priceBasketWithThreeItemsForBuyOneGetOneFree() {
        Basket basket = new Basket();
        basket.addProduct(new Product("beans", new Money("1.50")));
        basket.addProduct(new Product("beans", new Money("1.50")));
        basket.addProduct(new Product("beans", new Money("1.50")));
        List<Offer> offers = Arrays.asList(new BuyOneGetOneFreeOffer("beans"));
        BasketPricer pricer = new BasketPricer(offers);
        Assertions.assertEquals(new Money("3.00"), pricer.getPriceAfterDiscounts(basket));
    }

    @Test
    void priceBasketWithThreeItemsForThreeForPriceOfTwo() {
        Basket basket = new Basket();
        basket.addProduct(new Product("beans", new Money("1.50")));
        basket.addProduct(new Product("beans", new Money("1.50")));
        basket.addProduct(new Product("beans", new Money("1.50")));
        List<Offer> offers = Arrays.asList(new ThreeForPriceOfTwoOffer("beans"));
        BasketPricer pricer = new BasketPricer(offers);
        Assertions.assertEquals(new Money("3.00"), pricer.getPriceAfterDiscounts(basket));
    }

}
