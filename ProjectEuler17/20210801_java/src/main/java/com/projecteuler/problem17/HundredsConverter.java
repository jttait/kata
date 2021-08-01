package com.projecteuler.problem17;

import java.util.HashMap;
import java.util.Map;

public class HundredsConverter implements DigitConverter {

    private Map<Integer, String> conversions = new HashMap<>();

    public HundredsConverter() {
        conversions.put(1, "one hundred");
        conversions.put(2, "two hundred");
        conversions.put(3, "three hundred");
        conversions.put(4, "four hundred");
        conversions.put(5, "five hundred");
        conversions.put(6, "six hundred");
        conversions.put(7, "seven hundred");
        conversions.put(8, "eight hundred");
        conversions.put(9, "nine hundred");
    }

    public String convert(int digit) {
        if (digit == 0) {
            return "";
        }
        return conversions.get(digit);
    }
}
