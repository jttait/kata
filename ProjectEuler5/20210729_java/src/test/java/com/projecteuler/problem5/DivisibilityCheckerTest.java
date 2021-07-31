package com.projecteuler.problem5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibilityCheckerTest {

    DivisibilityChecker divisibilityChecker = new DivisibilityChecker();

    @Test
    void test2isDivisibleBy1And2() {
        List<Integer> divisors = Arrays.asList(1, 2);
        Assertions.assertTrue(divisibilityChecker.isDivisibleByAll(2, divisors));
    }

    @Test
    void test3isDivisibleBy1And3() {
        List<Integer> divisors = Arrays.asList(1, 3);
        Assertions.assertTrue(divisibilityChecker.isDivisibleByAll(3, divisors));
    }

    @Test
    void test3isNotDivisibleBy1And2() {
        List<Integer> divisors = Arrays.asList(1, 2);
        Assertions.assertFalse(divisibilityChecker.isDivisibleByAll(3, divisors));
    }

    @Test
    void test2520isDivisibleBy1To2() {
        List<Integer> divisors = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Assertions.assertTrue(divisibilityChecker.isDivisibleByAll(2520, divisors));
    }
}
