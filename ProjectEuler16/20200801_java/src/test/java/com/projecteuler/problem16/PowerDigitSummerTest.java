package com.projecteuler.problem16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class PowerDigitSummerTest {

    @Test
    void test2pow2() {
        Assertions.assertEquals(4, PowerDigitSummer.sum(BigInteger.TWO, 2));
    }

    @Test
    void test2pow10() {
        Assertions.assertEquals(7, PowerDigitSummer.sum(BigInteger.TWO, 10));
    }

    @Test
    void test2pow15() {
        Assertions.assertEquals(26, PowerDigitSummer.sum(BigInteger.TWO, 15));
    }

    @Test
    void test2pow1000() {
        Assertions.assertEquals(26, PowerDigitSummer.sum(BigInteger.TWO, 1000));
    }

}
