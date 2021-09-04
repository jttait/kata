package com.shoppingbasket.solution;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class BuyOneGetOneFreeOffer implements Offer {

    private String productName;

    BuyOneGetOneFreeOffer(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean isMatch(List<Product> products) {
        return products.stream().map(Product::getName).filter(x -> x.equals(productName)).count() >= 2;
    }

    @Override
    public Money calculateDiscount(List<Product> products) {
        int numMatchingProducts = (int) products.stream().map(Product::getName).filter(x -> x.equals(productName)).count();
        BigDecimal numForFree = BigDecimal.valueOf(numMatchingProducts / 2).setScale(0, RoundingMode.DOWN);
        Money price = products.stream().filter(x -> x.getName().equals(productName)).findFirst().get().getPrice();
        return price.multiply(numForFree);
    }
}
