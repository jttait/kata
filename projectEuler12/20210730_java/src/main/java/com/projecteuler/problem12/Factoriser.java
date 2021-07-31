package com.projecteuler.problem12;

import java.util.*;
import java.util.stream.Collectors;

public class Factoriser {

    public List<Integer> factors(int number) {
        Set<Integer> result = new HashSet<>();
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
                result.add(number / i);
            }
        }
        return result.stream().sorted().collect(Collectors.toList());
    }

    public int countFactors(int number) {
        return factors(number).size();
    }
}
