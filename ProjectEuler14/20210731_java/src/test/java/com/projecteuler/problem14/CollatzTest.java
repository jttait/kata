package com.projecteuler.problem14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CollatzTest {

    Collatz collatz;

    @BeforeEach
    void setup() {
        collatz = new Collatz();
    }

    @Test
    void testNextCollatz13() {
        Assertions.assertEquals(40, Collatz.next(13));
    }

    @Test
    void testNextCollatz40() {
        Assertions.assertEquals(20, Collatz.next(40));
    }

    @Test
    void testLengthCollatz1() {
        Assertions.assertEquals(1, collatz.length(1));
    }

    @Test
    void testLengthCollatz13() {
        Assertions.assertEquals(10, collatz.length(13));
    }
    
    @Test
    void testLongestCollatzBelow1000000() {
        Assertions.assertEquals(837799, collatz.longestBelow(1000000));
    }

}
