package com.mentor.meeting;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {

    private final ArrayList<Product> products;

    Basket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public BigDecimal getTotal() {
        return products.stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<BasketItem> getProducts() {
        return products.stream().map(x -> new BasketItem(x.getName(), x.getPrice())).collect(Collectors.toList());
    }
}
