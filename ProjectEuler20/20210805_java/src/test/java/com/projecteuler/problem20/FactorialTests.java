package com.projecteuler.problem20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class FactorialTests {

    @Test
    void testFactorialOf1() {
        Assertions.assertEquals(BigInteger.ONE, new Factorial(BigInteger.ONE).factorial());
    }

    @Test
    void testFactorialOf2() {
        Assertions.assertEquals(BigInteger.TWO, new Factorial(BigInteger.TWO).factorial());
    }

    @Test
    void testFactorialOf3() {
        Assertions.assertEquals(new BigInteger("6"), new Factorial(new BigInteger("3")).factorial());
    }

    @Test
    void testFactorialOf10() {
        Assertions.assertEquals(new BigInteger("3628800"), new Factorial(BigInteger.TEN).factorial());
    }

    @Test
    void testFactorialOf100() {
        Assertions.assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"), new Factorial(new BigInteger("100")).factorial());
    }

    @Test
    void testSumFactorialDigitsOf1() {
        Assertions.assertEquals(BigInteger.ONE, new Factorial(BigInteger.ONE).sumFactorialDigits());
    }

    @Test
    void testSumFactorialDigitsOf2() {
        Assertions.assertEquals(BigInteger.TWO, new Factorial(BigInteger.TWO).sumFactorialDigits());
    }

    @Test
    void testSumFactorialDigitsOf10() {
        Assertions.assertEquals(new BigInteger("27"), new Factorial(new BigInteger("10")).sumFactorialDigits());
    }

    @Test
    void testSumFactorialDigitsOf100() {
        Assertions.assertEquals(new BigInteger("648"), new Factorial(new BigInteger("100")).sumFactorialDigits());
    }

}
