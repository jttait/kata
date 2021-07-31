package com.projecteuler.problem5;

import java.util.List;

public class DivisibilityChecker {

    public boolean isDivisibleByAll(int number, List<Integer> divisors) {
        for (int divisor : divisors) {
            if (number % divisor != 0) {
                return false;
            }
        }
        return true;
    }
}
