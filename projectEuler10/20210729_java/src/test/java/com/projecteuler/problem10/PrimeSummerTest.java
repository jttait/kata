package com.projecteuler.problem10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeSummerTest {

    PrimeSummer primeSummer = new PrimeSummer();

    @Test
    void testSumOfPrimesBelow10() {
        Assertions.assertEquals(17, primeSummer.sumBelow(10));
    }

    @Test
    void testSumOfPrimesBelow2000000() {
        Assertions.assertEquals(17, primeSummer.sumBelow(2000000));
    }
}
