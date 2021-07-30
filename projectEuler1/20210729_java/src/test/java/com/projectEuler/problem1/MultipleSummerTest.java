package com.projectEuler.problem1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultipleSummerTest {

    MultipleSummer multipleSummer = new MultipleSummer();

    @Test
    void testSumMultiplesBelow2() {
        Assertions.assertEquals(0, multipleSummer.sumMultiplesOf3And5Below(2));
    }

    @Test
    void testSumMultiplesBelow3() {
        Assertions.assertEquals(0, multipleSummer.sumMultiplesOf3And5Below(3));
    }

    @Test
    void testSumMultiplesBelow4() {
        Assertions.assertEquals(3, multipleSummer.sumMultiplesOf3And5Below(4));
    }

    @Test
    void testSumMultiplesBelow5() {
        Assertions.assertEquals(3, multipleSummer.sumMultiplesOf3And5Below(5));
    }

    @Test
    void testSumMultiplesBelow6() {
        Assertions.assertEquals(8, multipleSummer.sumMultiplesOf3And5Below(6));
    }

    @Test
    void testSumMultiplesBelow10() {
        Assertions.assertEquals(33, multipleSummer.sumMultiplesOf3And5Below(11));
    }

    @Test
    void testSumMultiplesBelow1000() {
        Assertions.assertEquals(233168, multipleSummer.sumMultiplesOf3And5Below(1000));
    }
}
