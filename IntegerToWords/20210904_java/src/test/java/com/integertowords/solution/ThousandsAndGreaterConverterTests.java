package com.integertowords.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThousandsAndGreaterConverterTests {

    private ThousandsAndGreaterConverter converter;

    @BeforeEach
    void setup() {
        this.converter = new ThousandsAndGreaterConverter();
    }

    @Test
    void test1000() {
        StringBuilder sb = new StringBuilder();
        converter.convert(sb, 1000, 1000);
        Assertions.assertEquals("one thousand", sb.toString());
    }

}
