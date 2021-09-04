package com.integertowords.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitsAndTeensConverterTests {

    private UnitsAndTeensConverter converter;

    @BeforeEach
    void setup() {
        converter = new UnitsAndTeensConverter();
    }

    @Test
    void test1() {
        StringBuilder sb = new StringBuilder();
        converter.convert(sb, 1);
        Assertions.assertEquals("one", sb.toString());
    }

    @Test
    void test5() {
        StringBuilder sb = new StringBuilder();
        converter.convert(sb, 5);
        Assertions.assertEquals("five", sb.toString());
    }

    @Test
    void test10() {
        StringBuilder sb = new StringBuilder();
        converter.convert(sb, 10);
        Assertions.assertEquals("ten", sb.toString());
    }

    @Test
    void test14() {
        StringBuilder sb = new StringBuilder();
        converter.convert(sb, 14);
        Assertions.assertEquals("fourteen", sb.toString());
    }

    @Test
    void test18() {
        StringBuilder sb = new StringBuilder();
        converter.convert(sb, 18);
        Assertions.assertEquals("eighteen", sb.toString());
    }
}
