package com.projecteuler.problem12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangularTest {

    Triangular triangular = new Triangular();

    @Test
    void testFirstWithMoreThan1divisors() {
        Assertions.assertEquals(1, triangular.firstWithNDivisors(1));
    }

    @Test
    void testFirstWithMoreThan2divisors() {
        Assertions.assertEquals(3, triangular.firstWithNDivisors(2));
    }

    @Test
    void testFirstWithMoreThan3divisors() {
        Assertions.assertEquals(6, triangular.firstWithNDivisors(3));
    }

    @Test
    void testFirstWithMoreThan5divisors() {
        Assertions.assertEquals(28, triangular.firstWithNDivisors(5));
    }

    @Test
    void testFirstWithMoreThan500divisors() {
        Assertions.assertEquals(28, triangular.firstWithNDivisors(500));
    }

}
