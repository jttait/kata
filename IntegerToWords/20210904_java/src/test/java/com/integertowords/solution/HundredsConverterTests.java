package com.integertowords.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HundredsConverterTests {

    private HundredsConverter converter;

    @BeforeEach
    void setup() {
        this.converter = new HundredsConverter();
    }

    @Test
    void test100() {
        StringBuilder sb = new StringBuilder();
        converter.convert(sb, 100);
        Assertions.assertEquals("one hundred", sb.toString());
    }

    @Test
    void test101() {
        StringBuilder sb = new StringBuilder();
        converter.convert(sb, 101);
        Assertions.assertEquals("one hundred and ", sb.toString());
    }
}