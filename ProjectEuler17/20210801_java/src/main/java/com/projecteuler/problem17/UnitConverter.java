package com.projecteuler.problem17;

import java.util.HashMap;
import java.util.Map;

public class UnitConverter implements DigitConverter {

    private Map<Integer, String> conversions = new HashMap<>();

    public UnitConverter() {
        conversions.put(1, "one");
        conversions.put(2, "two");
        conversions.put(3, "three");
        conversions.put(4, "four");
        conversions.put(5, "five");
        conversions.put(6, "six");
        conversions.put(7, "seven");
        conversions.put(8, "eight");
        conversions.put(9, "nine");
    }

    public String convert(int number) {
        if (number == 0) {
            return "";
        }
        return conversions.get(number);
    }
}
