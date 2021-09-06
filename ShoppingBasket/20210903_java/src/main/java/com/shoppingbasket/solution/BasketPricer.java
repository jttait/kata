package com.shoppingbasket.solution;

import java.util.ArrayList;
import java.util.List;

public class BasketPricer {

    private final List<Offer> offers;

    BasketPricer() {
        this.offers = new ArrayList<>();
    }

    BasketPricer(List<Offer> offers) {
        this.offers = offers;
    }

    public Money getPriceBeforeDiscounts(Basket basket) {
        return basket.getProducts().stream().map(Product::getPrice).reduce(new Money("0.0"), Money::add);
    }

    public Money getPriceAfterDiscounts(Basket basket) {
        Money price = basket.getProducts().stream().map(Product::getPrice).reduce(new Money("0.0"), Money::add);
        for (Offer offer : offers) {
            if (offer.isMatch(basket.getProducts())) {
                price = price.subtract(offer.calculateDiscount(basket.getProducts()));
            }
        }
        return price;
    }
}
