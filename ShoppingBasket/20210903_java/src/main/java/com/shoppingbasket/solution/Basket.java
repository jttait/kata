package com.shoppingbasket.solution;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Product> products;

    Basket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }
}
