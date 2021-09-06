package com.integertowords.solution;

import java.util.HashMap;
import java.util.Map;

public class UnitsAndTeensConverter {

    private final Map<Integer, String> conversions;

    UnitsAndTeensConverter() {
        this.conversions = new HashMap<>();
        this.conversions.put(1, "one");
        this.conversions.put(2, "two");
        this.conversions.put(3, "three");
        this.conversions.put(4, "four");
        this.conversions.put(5, "five");
        this.conversions.put(6, "six");
        this.conversions.put(7, "seven");
        this.conversions.put(8, "eight");
        this.conversions.put(9, "nine");
        this.conversions.put(10, "ten");
        this.conversions.put(11, "eleven");
        this.conversions.put(12, "twelve");
        this.conversions.put(13, "thirteen");
        this.conversions.put(14, "fourteen");
        this.conversions.put(15, "fifteen");
        this.conversions.put(16, "sixteen");
        this.conversions.put(17, "seventeen");
        this.conversions.put(18, "eighteen");
        this.conversions.put(19, "nineteen");
    }

    public void convert(StringBuilder sb, int number) {
        if (number <= 0) {
            return;
        }
        sb.append(conversions.get(number));
    }

}
