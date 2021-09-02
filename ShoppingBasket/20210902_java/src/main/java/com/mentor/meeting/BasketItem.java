package com.mentor.meeting;

import java.math.BigDecimal;
import java.util.Objects;

public class BasketItem {

    private final String name;
    private final BigDecimal total;

    public BasketItem(String name, BigDecimal total) {
        this.name = name;
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasketItem that = (BasketItem) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, total);
    }
}
