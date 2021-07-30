package com.projecteuler.problem5;

import java.util.List;

public class SmallestEvenlyDivisibleNumberFinder {

    DivisibilityChecker divisibilityChecker = new DivisibilityChecker();

    public int evenlyDivisibleByAll(List<Integer> divisors) {
        int number = 1;
        while (!divisibilityChecker.isDivisibleByAll(number, divisors)) {
            number++;
        }
        return number;
    }
}
