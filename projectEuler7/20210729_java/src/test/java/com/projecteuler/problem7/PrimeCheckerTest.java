package com.projecteuler.problem7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrimeCheckerTest {

    PrimeChecker primeChecker = new PrimeChecker();

    @ParameterizedTest
    @ValueSource(ints = { 2, 3, 5, 7, 11, 13 })
    void testPrimes(int number) {
        Assertions.assertTrue(primeChecker.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 4, 9, 10, 12, 25 })
    void testNonPrimes(int number) {
        Assertions.assertFalse(primeChecker.isPrime(number));
    }


}
