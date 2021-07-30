package com.projectEuler.problem2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FibonacciSequenceTest {

    FibonacciSequence fibonacciSequence = new FibonacciSequence();

    @Test
    void testFibonacciSequenceUpTo1() {
        List<Integer> expected = Arrays.asList(1);
        Assertions.assertEquals(expected, fibonacciSequence.generate(1));
    }

    @Test
    void testFibonacciSequenceUpTo2() {
        List<Integer> expected = Arrays.asList(1, 2);
        Assertions.assertEquals(expected, fibonacciSequence.generate(2));
    }

    @Test
    void testFibonacciSequenceUpTo10() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 5, 8);
        Assertions.assertEquals(expected, fibonacciSequence.generate(10));
    }

    @Test
    void testSumEvenValuedFibonacciNumbersUpTo10() {
        Assertions.assertEquals(10, fibonacciSequence.sumEvenValuedTerms(10));
    }

    @Test
    void testSumEvenValuedFibonacciNumbersUpTo4000000() {
        Assertions.assertEquals(4613732, fibonacciSequence.sumEvenValuedTerms(4000000));
    }
}
