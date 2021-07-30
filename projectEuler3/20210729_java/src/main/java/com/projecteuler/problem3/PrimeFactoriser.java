package com.projecteuler.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactoriser {

    public List<Integer> factorsOf(long number) {
        List<Integer> factors = new ArrayList<>();
        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }
        for (int i = 3; i <= number; i += 2) {
            if (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }

    public int largestFactorOf(long number) {
        return Collections.max(factorsOf(number));
    }
}
