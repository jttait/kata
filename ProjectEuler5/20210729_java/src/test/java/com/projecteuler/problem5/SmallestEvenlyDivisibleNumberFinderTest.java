package com.projecteuler.problem5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class SmallestEvenlyDivisibleNumberFinderTest {

    SmallestEvenlyDivisibleNumberFinder finder = new SmallestEvenlyDivisibleNumberFinder();

    @Test
    void test2520isSmallestEvenlyDivisibleBy1To10() {
        List<Integer> divisors = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        Assertions.assertEquals(2520, finder.evenlyDivisibleByAll(divisors));
    }

    @Test
    void test232792560isSmallestEvenlyDivisibleBy1To20() {
        List<Integer> divisors = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
        Assertions.assertEquals(232792560, finder.evenlyDivisibleByAll(divisors));
    }
}
