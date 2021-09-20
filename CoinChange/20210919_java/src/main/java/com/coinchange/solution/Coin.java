package com.coinchange.solution;

public enum Coin {
    DOLLAR(100),
    HALF(50),
    QUARTER(25),
    DIME(10),
    NICKEL(5),
    PENNY(1);

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
