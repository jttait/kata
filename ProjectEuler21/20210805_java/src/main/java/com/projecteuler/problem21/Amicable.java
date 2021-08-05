package com.projecteuler.problem21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Amicable {

    public int sumProperDivisorsOf(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public boolean isAmicableNumber(int number) {
        int sumOfProperDivisorsOfNumber = sumProperDivisorsOf(number);
        if (sumOfProperDivisorsOfNumber == number) {
            return false;
        }
        return number == sumProperDivisorsOf(sumOfProperDivisorsOfNumber);
    }

    public int sumAmicableNumbers(int start, int end) {
        Set<Integer> amicableNumbers = new HashSet<>();
        for (int i = start; i < end; i++) {
            if (isAmicableNumber(i)) {
                amicableNumbers.add(i);
                amicableNumbers.add(sumProperDivisorsOf(i));
            }
        }
        return amicableNumbers.stream().reduce(0, Integer::sum);
    }
}
