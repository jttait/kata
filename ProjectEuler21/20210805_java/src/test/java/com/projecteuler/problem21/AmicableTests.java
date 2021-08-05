package com.projecteuler.problem21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class AmicableTests {

    @Test
    void sumProperDivisorsOf1() {
        Assertions.assertEquals(0, new Amicable().sumProperDivisorsOf(1));
    }

    @Test
    void sumProperDivisorsOf2() {
        Assertions.assertEquals(1, new Amicable().sumProperDivisorsOf(2));
    }

    @Test
    void sumProperDivisorsOf3() {
        Assertions.assertEquals(1, new Amicable().sumProperDivisorsOf(3));
    }

    @Test
    void sumProperDivisorsOf284() {
        Assertions.assertEquals(284, new Amicable().sumProperDivisorsOf(220));
    }

    @Test
    void sumProperDivisorsOf220() {
        Assertions.assertEquals(220, new Amicable().sumProperDivisorsOf(284));
    }

    @Test
    void is220amicable() {
        Assertions.assertTrue(new Amicable().isAmicableNumber(220));
    }

    @Test
    void is284amicable() {
        Assertions.assertTrue(new Amicable().isAmicableNumber(284));
    }

    @Test
    void is1184amicable() {
        Assertions.assertTrue(new Amicable().isAmicableNumber(1184));
    }

    @Test
    void is1210amicable() {
        Assertions.assertTrue(new Amicable().isAmicableNumber(1184));
    }

    @Test
    void is10amicable() {
        Assertions.assertFalse(new Amicable().isAmicableNumber(10));
    }

    @Test
    void sumAmicableNumbersBelow1000() {
        int expected = 220 + 284;
        Assertions.assertEquals(expected, new Amicable().sumAmicableNumbers(1, 1000));
    }

    @Test
    void sumAmicableNumbersBelow2000() {
        int expected = 220 + 284 + 1184 + 1210;
        Assertions.assertEquals(expected, new Amicable().sumAmicableNumbers(1, 2000));
    }

    @Test
    void sumAmicableNumbersBelow3000() {
        int expected = 220 + 284 + 1184 + 1210 + 2620 + 2924;
        Assertions.assertEquals(expected, new Amicable().sumAmicableNumbers(1, 3000));
    }

    @Test
    void sumAmicableNumbersBelow6000() {
        int expected = 220 + 284 + 1184 + 1210 + 2620 + 2924 + 5020 + 5564;
        Assertions.assertEquals(expected, new Amicable().sumAmicableNumbers(1, 6000));
    }

    @Test
    void sumAmicableNumbersBelow7000() {
        int expected = 220 + 284 + 1184 + 1210 + 2620 + 2924 + 5020 + 5564 + 6232 + 6368;
        Assertions.assertEquals(expected, new Amicable().sumAmicableNumbers(1, 7000));
    }

    @Test
    void sumAmicableNumbersBelow10000() {
        int expected = 31626;
        Assertions.assertEquals(expected, new Amicable().sumAmicableNumbers(1, 10000));
    }
}
