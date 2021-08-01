package com.projecteuler.problem17;

import java.util.HashMap;
import java.util.Map;

public class TensAndUnitsConverter implements DigitConverter {

    private Map<Integer, String> conversions = new HashMap<>();
    private UnitConverter unitConverter = new UnitConverter();

    public TensAndUnitsConverter() {
        conversions.put(10, "ten");
        conversions.put(11, "eleven");
        conversions.put(12, "twelve");
        conversions.put(13, "thirteen");
        conversions.put(14, "fourteen");
        conversions.put(15, "fifteen");
        conversions.put(16, "sixteen");
        conversions.put(17, "seventeen");
        conversions.put(18, "eighteen");
        conversions.put(19, "nineteen");
        conversions.put(2, "twenty");
        conversions.put(3, "thirty");
        conversions.put(4, "forty");
        conversions.put(5, "fifty");
        conversions.put(6, "sixty");
        conversions.put(7, "seventy");
        conversions.put(8, "eighty");
        conversions.put(9, "ninety");
    }

    public String convert(int digit) {
        if (digit == 0) {
            return "";
        } else if (digit <= 9) {
            return unitConverter.convert(digit);
        } else if (digit < 20) {
            return conversions.get(digit);
        } else if (digit % 10 == 0) {
            return conversions.get(digit / 10);
        }
        return conversions.get(digit / 10) + " " + unitConverter.convert(digit % 10);
    }
}
