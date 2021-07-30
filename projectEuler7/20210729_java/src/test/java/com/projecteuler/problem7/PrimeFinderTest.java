package com.projecteuler.problem7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeFinderTest {

    PrimeFinder primeFinder = new PrimeFinder();

    @Test
    void testFirstPrime() {
        Assertions.assertEquals(2, primeFinder.findNthPrime(1));
    }

    @Test
    void testSecondPrime() {
        Assertions.assertEquals(3, primeFinder.findNthPrime(2));
    }

    @Test
    void testThirdPrime() {
        Assertions.assertEquals(5, primeFinder.findNthPrime(3));
    }

    @Test
    void testFourthPrime() {
        Assertions.assertEquals(7, primeFinder.findNthPrime(4));
    }

    @Test
    void testSixthPrime() {
        Assertions.assertEquals(13, primeFinder.findNthPrime(6));
    }

    @Test
    void test10001stPrime() {
        Assertions.assertEquals(104743, primeFinder.findNthPrime(10001));
    }
}
