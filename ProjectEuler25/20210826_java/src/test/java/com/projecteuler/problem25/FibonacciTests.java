package com.projecteuler.problem25;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTests {

    @Test
    void testFirstFibonacciNumberWith1digit() {
        Assertions.assertEquals(1, Fibonacci.firstFibonacciNumberWithNdigits(1));
    }

    @Test
    void testFirstFibonacciNumberWith2digits() {
        Assertions.assertEquals(7, Fibonacci.firstFibonacciNumberWithNdigits(2));
    }

    @Test
    void testFirstFibonacciNumberWith3digits() {
        Assertions.assertEquals(12, Fibonacci.firstFibonacciNumberWithNdigits(3));
    }

    @Test
    void testFirstFibonacciNumberWith1000digits() {
        Assertions.assertEquals(4782, Fibonacci.firstFibonacciNumberWithNdigits(1000));
    }

}
