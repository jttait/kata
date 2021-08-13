package com.projecteuler.problem23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class AbundanceTests {

    @Test
    void properDivisorsOf12() {
        int expected = 1 + 2 + 3 + 4 + 6;
        Assertions.assertEquals(expected, new Abundance().sumProperDivisors(12));
    }

    @Test
    void properDivisorsOf28() {
        int expected = 1 + 2 + 4 + 7 + 14;
        Assertions.assertEquals(expected, new Abundance().sumProperDivisors(28));
    }

    @Test
    void test12isAbundant() {
        Assertions.assertTrue(new Abundance().isAbundant(12));
    }

    @Test
    void test11isNotAbundant() {
        Assertions.assertFalse(new Abundance().isAbundant(11));
    }

    @Test
    void test28isNotAbundant() {
        Assertions.assertFalse(new Abundance().isAbundant(28));
    }

    @Test
    void test24isSumOfTwoAbundantNumbers() {
        Abundance abundance = new Abundance();
        List<Integer> abundantNumbers = abundance.listAbundantNumbers(24);
        Assertions.assertTrue(abundance.isSumOfTwoAbundantNumbers(abundantNumbers,24));
    }

    @Test
    void test23isNotSumOfTwoAbundantNumbers() {
        Abundance abundance = new Abundance();
        List<Integer> abundantNumbers = abundance.listAbundantNumbers(23);
        Assertions.assertFalse(new Abundance().isSumOfTwoAbundantNumbers(abundantNumbers, 23));
    }

    @Test
    void test30isSumOfTwoAbundantNumbers() {
        Abundance abundance = new Abundance();
        List<Integer> abundantNumbers = abundance.listAbundantNumbers(30);
        Assertions.assertTrue(new Abundance().isSumOfTwoAbundantNumbers(abundantNumbers, 30));
    }

    @Test
    void testAbundantNumbersUpTo11() {
        Assertions.assertEquals(Collections.emptyList(), new Abundance().listAbundantNumbers(11));
    }
    @Test
    void testAbundantNumbersUpto12() {
        Assertions.assertEquals(List.of(12), new Abundance().listAbundantNumbers(12));
    }

    @Test
    void testAbundantNumbersUpTo17() {
        Assertions.assertEquals(List.of(12), new Abundance().listAbundantNumbers(17));
    }

    @Test
    void testAbundantNumbersUpTo18() {
        Assertions.assertEquals(List.of(12, 18), new Abundance().listAbundantNumbers(18));
    }

    @Test
    void testSumOfNumbersThatAreNotSumOfTwoAbundantNumbersUpTo5() {
        Assertions.assertEquals(15, new Abundance().sumOfNumbersThatAreNotSumOfTwoAbundantNumbers(5));
    }

    @Test
    void testSumOfNumbersThatAreNotSumOfTwoAbundantNumbersUpTo28123() {
        Assertions.assertEquals(4179871, new Abundance().sumOfNumbersThatAreNotSumOfTwoAbundantNumbers(28123));
    }
}
