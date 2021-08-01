package com.projecteuler.problem17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberLettersCounterTest {

    @Test
    void testOne() {
        Assertions.assertEquals(3, NumberLettersCounter.countNumber(1));
    }

    @Test
    void testThree() {
        Assertions.assertEquals(5, NumberLettersCounter.countNumber(3));
    }

    @Test
    void testTwenty() {
        Assertions.assertEquals(6, NumberLettersCounter.countNumber(20));
    }

    @Test
    void testNinetyEight() {
        Assertions.assertEquals(11, NumberLettersCounter.countNumber(98));
    }

    @Test
    void testTwoHundredAndSeven() {
        Assertions.assertEquals(18, NumberLettersCounter.countNumber(207));
    }

    @Test
    void testOneThousand() {
        Assertions.assertEquals(11, NumberLettersCounter.countNumber(1000));
    }

    @Test
    void testRangeToOne() {
        Assertions.assertEquals(3, NumberLettersCounter.countRangeClosed(1));
    }

    @Test
    void testRangeToThree() {
        Assertions.assertEquals(11, NumberLettersCounter.countRangeClosed(3));
    }

    @Test
    void testRangeToFour() {
        Assertions.assertEquals(15, NumberLettersCounter.countRangeClosed(4));
    }

    @Test
    void testRangeToOneThousand() {
        Assertions.assertEquals(11, NumberLettersCounter.countRangeClosed(1000));
    }
}
