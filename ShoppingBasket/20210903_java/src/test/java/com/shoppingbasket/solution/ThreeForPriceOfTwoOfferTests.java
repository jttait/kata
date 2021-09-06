package com.shoppingbasket.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ThreeForPriceOfTwoOfferTests {

    @Test
    void testMatchForThreeProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        Offer offer = new ThreeForPriceOfTwoOffer("beans");
        Assertions.assertTrue(offer.isMatch(products));
    }

    @Test
    void testDiscountWithThreeProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        Offer offer = new ThreeForPriceOfTwoOffer("beans");
        Assertions.assertEquals(new Money("1.50"), offer.calculateDiscount(products));
    }

    @Test
    void testDiscountWithFourProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        Offer offer = new ThreeForPriceOfTwoOffer("beans");
        Assertions.assertEquals(new Money("1.50"), offer.calculateDiscount(products));
    }

    @Test
    void testDiscountWithSixProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        Offer offer = new ThreeForPriceOfTwoOffer("beans");
        Assertions.assertEquals(new Money("3.00"), offer.calculateDiscount(products));
    }
}
