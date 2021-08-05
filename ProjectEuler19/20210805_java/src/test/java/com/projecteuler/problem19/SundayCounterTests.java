package com.projecteuler.problem19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class SundayCounterTests {

    @Test
    void test1() {
        LocalDate start = LocalDate.of(1901, 1, 1);
        LocalDate end = LocalDate.of(2000, 12, 31);
        Assertions.assertEquals(5, SundayCounter.count(start, end));
    }

}
