package com.shoppingbasket.solution;

import java.util.List;

public interface Offer {
    public boolean isMatch(List<Product> products);
    public Money calculateDiscount(List<Product> products);
}
