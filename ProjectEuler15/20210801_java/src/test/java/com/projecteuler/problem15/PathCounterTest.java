package com.projecteuler.problem15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PathCounterTest {

    @Test
    void test2by2() {
        Assertions.assertEquals(6, PathCounter.grid(2, 2));
    }

    @Test
    void test3by3() {
        Assertions.assertEquals(6, PathCounter.grid(20, 20));
    }

}
