package com.shoppingbasket.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BuyOneGetOneFreeOfferTests {

    @Test
    void testMatchWithTwoOfSameProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        Offer offer = new BuyOneGetOneFreeOffer("beans");
        Assertions.assertTrue(offer.isMatch(products));
    }

    @Test
    void testDiscountWithTwoOfSameProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        Offer offer = new BuyOneGetOneFreeOffer("beans");
        Assertions.assertEquals(new Money("1.50"), offer.calculateDiscount(products));
    }

    @Test
    void testDiscountWithThreeOfSameProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        Offer offer = new BuyOneGetOneFreeOffer("beans");
        Assertions.assertEquals(new Money("1.50"), offer.calculateDiscount(products));
    }

    @Test
    void testDiscountWithFourOfSameProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        products.add(new Product("beans", new Money("1.50")));
        Offer offer = new BuyOneGetOneFreeOffer("beans");
        Assertions.assertEquals(new Money("3.00"), offer.calculateDiscount(products));
    }

}
