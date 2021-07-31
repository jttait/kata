package com.projecteuler.problem10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeCheckerTest {

    PrimeChecker primeChecker = new PrimeChecker();

    @Test
    void test1isNotPrime() {
        Assertions.assertFalse(primeChecker.isPrime(1));
    }

    @Test
    void test2isPrime() {
        Assertions.assertTrue(primeChecker.isPrime(2));
    }

    @Test
    void test3isPrime() {
        Assertions.assertTrue(primeChecker.isPrime(3));
    }

    @Test
    void test4isNotPrime() {
        Assertions.assertFalse(primeChecker.isPrime(4));
    }

    @Test
    void test5isNotPrime() {
        Assertions.assertTrue(primeChecker.isPrime(5));
    }

    @Test
    void test7isPrime() {
        Assertions.assertTrue(primeChecker.isPrime(7));
    }

}
