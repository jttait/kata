package com.projecteuler.problem9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PythagorasTest {

    Pythagoras pythagoras = new Pythagoras();

    @Test
    void test3and4and5isTriplet() {
        Assertions.assertTrue(pythagoras.isTriplet(3, 4, 5));
    }

    @Test
    void test3and4and6isNotTriplet() {
        Assertions.assertFalse(pythagoras.isTriplet(3, 4, 6));
    }

    @Test
    void test5and12and13isTriplet() {
        Assertions.assertTrue(pythagoras.isTriplet(13, 12, 5));
    }

    @Test
    void testTripletWithSumOf12() {
        Assertions.assertEquals(60, pythagoras.findProductOfTripletWithSum(12));
    }

    @Test
    void testTripletWithSumOf1000() {
        Assertions.assertEquals(31875000, pythagoras.findProductOfTripletWithSum(1000));
    }

}
