package com.shoppingbasket.solution;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Money {

    private final BigDecimal amount;

    Money(String amount) {
        this.amount = new BigDecimal(amount).setScale(2, RoundingMode.DOWN);
    }

    public Money add(Money money2) {
        return new Money(this.amount.add(money2.amount).toString());
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    public Money multiply(BigDecimal multiplier) {
        return new Money(this.amount.multiply(multiplier).toString());
    }

    public Money subtract(Money money2) {
        return new Money(this.amount.subtract(money2.amount).toString());
    }
}
