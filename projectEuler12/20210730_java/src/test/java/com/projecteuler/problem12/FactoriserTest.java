package com.projecteuler.problem12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class FactoriserTest {

    Factoriser factoriser = new Factoriser();

    @Test
    void testFactorsOf1() {
        List<Integer> factors = Collections.singletonList(1);
        Assertions.assertEquals(factors, factoriser.factors(1));
    }

    @Test
    void testFactorsOf2() {
        List<Integer> factors = Arrays.asList(1, 2);
        Assertions.assertEquals(factors, factoriser.factors(2));
    }

    @Test
    void testFactorsOf3() {
        List<Integer> factors = Arrays.asList(1, 3);
        Assertions.assertEquals(factors, factoriser.factors(3));
    }

    @Test
    void testFactorsOf6() {
        List<Integer> factors = Arrays.asList(1, 2, 3, 6);
        Assertions.assertEquals(factors, factoriser.factors(6));
    }

    @Test
    void testFactorsOf10() {
        List<Integer> factors = Arrays.asList(1, 2, 5, 10);
        Assertions.assertEquals(factors, factoriser.factors(10));
    }

    @Test
    void testFactorsOf15() {
        List<Integer> factors = Arrays.asList(1, 3, 5, 15);
        Assertions.assertEquals(factors, factoriser.factors(15));
    }

    @Test
    void testFactorsOf21() {
        List<Integer> factors = Arrays.asList(1, 3, 7, 21);
        Assertions.assertEquals(factors, factoriser.factors(21));
    }

    @Test
    void testFactorsOf28() {
        List<Integer> factors = Arrays.asList(1, 2, 4, 7, 14, 28);
        Assertions.assertEquals(factors, factoriser.factors(28));
    }

    @Test
    void testCountFactorsOf21() {
        Assertions.assertEquals(4, factoriser.countFactors(21));
    }

    @Test
    void testCountFactorsOf28() {
        Assertions.assertEquals(6, factoriser.countFactors(28));
    }

}
