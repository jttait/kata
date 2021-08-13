package com.projecteuler.problem23;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Abundance {

    public int sumProperDivisors(int number) {
        return IntStream.range(1, number).filter(x -> number % x == 0).sum();
    }

    public boolean isAbundant(int number) {
        return sumProperDivisors(number) > number;
    }

    public List<Integer> listAbundantNumbers(int upperInclusive) {
        return IntStream.rangeClosed(1, upperInclusive).filter(this::isAbundant).sorted().boxed().collect(Collectors.toList());
    }

    public long sumOfNumbersThatAreNotSumOfTwoAbundantNumbers(int upperInclusive) {
        List<Integer> abundantNumbers = listAbundantNumbers(upperInclusive);
        long sum = 0;
        for (int number = 1; number <= upperInclusive; number++) {
            if (!isSumOfTwoAbundantNumbers(abundantNumbers, number)) {
                sum += number;
            }
        }
        return sum;
    }

    public boolean isSumOfTwoAbundantNumbers(List<Integer> abundantNumbers, int number) {
        for (int i = 0; i < abundantNumbers.size() && abundantNumbers.get(i) < number; i++) {
            for (int j = 0; j < abundantNumbers.size() && abundantNumbers.get(j) < number; j++) {
                if (abundantNumbers.get(i) + abundantNumbers.get(j) == number) {
                    return true;
                }
            }
        }
        return false;
    }
}
