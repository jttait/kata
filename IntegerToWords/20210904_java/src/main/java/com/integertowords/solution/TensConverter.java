package com.integertowords.solution;

import java.util.HashMap;
import java.util.Map;

public class TensConverter {

    private final Map<Integer, String> conversions;

    TensConverter() {
        this.conversions = new HashMap<>();
        this.conversions.put(2, "twenty");
        this.conversions.put(3, "thirty");
        this.conversions.put(4, "forty");
        this.conversions.put(5, "fifty");
        this.conversions.put(6, "sixty");
        this.conversions.put(7, "seventy");
        this.conversions.put(8, "eighty");
        this.conversions.put(9, "ninety");
    }

    public int convert(StringBuilder sb, int number) {
        if (number < 20) {
            return number;
        }
        int tens = number / 10;
        sb.append(this.conversions.get(tens));
        number -= tens * 10;
        if (number > 0) {
            sb.append(" ");
        }
        return number;
    }
}
