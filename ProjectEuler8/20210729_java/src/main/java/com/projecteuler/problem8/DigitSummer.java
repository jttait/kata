package com.projecteuler.problem8;

public class DigitSummer {

    public long product(String string, int start, int end) {
        long product = 1;
        for (int i = start; i < end; i++) {
            product *= string.charAt(i) - '0';
        }
        return product;
    }

    public long largestAdjacentProduct(String string, int adjacentDigits) {
        long largestProduct = 0;
        for (int i = 0; i < string.length() - adjacentDigits + 1; i++) {
            long product = product(string, i, i + adjacentDigits);
            largestProduct = Math.max(largestProduct, product);
        }
        return largestProduct;
    }
}
