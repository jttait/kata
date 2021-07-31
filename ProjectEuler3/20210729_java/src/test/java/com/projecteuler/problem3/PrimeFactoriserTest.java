package com.projecteuler.problem3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PrimeFactoriserTest {

    PrimeFactoriser primeFactoriser = new PrimeFactoriser();

    @Test
    void testPrimeFactorsOf2() {
        List<Integer> expected = Arrays.asList(2);
        Assertions.assertEquals(expected, primeFactoriser.factorsOf(2L));
    }

    @Test
    void testPrimeFactorsOf3() {
        List<Integer> expected = Arrays.asList(3);
        Assertions.assertEquals(expected, primeFactoriser.factorsOf(3L));
    }

    @Test
    void testPrimeFactorsOf4() {
        List<Integer> expected = Arrays.asList(2, 2);
        Assertions.assertEquals(expected, primeFactoriser.factorsOf(4L));
    }

    @Test
    void testPrimeFactorsOf5() {
        List<Integer> expected = Arrays.asList(5);
        Assertions.assertEquals(expected, primeFactoriser.factorsOf(5L));
    }

    @Test
    void testPrimeFactorsOf13195() {
        List<Integer> expected = Arrays.asList(5, 7, 13, 29);
        Assertions.assertEquals(expected, primeFactoriser.factorsOf(13195L));
    }

    @Test
    void testPrimeFactorsOf600851475143() {
        List<Integer> expected = Arrays.asList(71, 839, 1471, 6857);
        Assertions.assertEquals(expected, primeFactoriser.factorsOf(600851475143L));
    }

    @Test
    void testLargestPrimeFactorOf2() {
        Assertions.assertEquals(2, primeFactoriser.largestFactorOf(2L));
    }

    @Test
    void testLargestPrimeFactorOf13195() {
        Assertions.assertEquals(29, primeFactoriser.largestFactorOf(13195L));
    }

    @Test
    void testLargestPrimeFactorOf600851475143() {
        Assertions.assertEquals(6857, primeFactoriser.largestFactorOf(600851475143L));
    }

}
