package com.integertowords.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TensConverterTests {

    private TensConverter converter;

    @BeforeEach
    void setup() {
        this.converter = new TensConverter();
    }

    @Test
    void test20() {
        StringBuilder sb = new StringBuilder();
        converter.convert(sb, 20);
        Assertions.assertEquals("twenty", sb.toString());
    }

    @Test
    void test21() {
        StringBuilder sb = new StringBuilder();
        converter.convert(sb, 21);
        Assertions.assertEquals("twenty ", sb.toString());
    }
}
