package com.projecteuler.problem17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberConverterTest {

    @Test
    void testOneHundred() {
        NumberConverter converter = new NumberConverter(100);
        Assertions.assertEquals("one hundred", converter.convert());
    }

    @Test
    void testSixHundred() {
        NumberConverter converter = new NumberConverter(600);
        Assertions.assertEquals("six hundred", converter.convert());
    }

    @Test
    void testSixHundredAndTen() {
        NumberConverter converter = new NumberConverter(610);
        Assertions.assertEquals("six hundred and ten", converter.convert());
    }

    @Test
    void testTen() {
        NumberConverter converter = new NumberConverter(10);
        Assertions.assertEquals("ten", converter.convert());
    }

    @Test
    void testEleven() {
        NumberConverter converter = new NumberConverter(11);
        Assertions.assertEquals("eleven", converter.convert());
    }

    @Test
    void testOne() {
        NumberConverter converter = new NumberConverter(1);
        Assertions.assertEquals("one", converter.convert());
    }

    @Test
    void testTwo() {
        NumberConverter converter = new NumberConverter(2);
        Assertions.assertEquals("two", converter.convert());
    }

    @Test
    void testThree() {
        NumberConverter converter = new NumberConverter(3);
        Assertions.assertEquals("three", converter.convert());
    }

    @Test
    void testFortyTwo() {
        NumberConverter converter = new NumberConverter(42);
        Assertions.assertEquals("forty two", converter.convert());
    }

    @Test
    void testForty() {
        NumberConverter converter = new NumberConverter(40);
        Assertions.assertEquals("forty", converter.convert());
    }

    @Test
    void testNineHundredAndSixtyOne() {
        NumberConverter converter = new NumberConverter(961);
        Assertions.assertEquals("nine hundred and sixty one", converter.convert());
    }

    @Test
    void testFourHundredAndEighteen() {
        NumberConverter converter = new NumberConverter(418);
        Assertions.assertEquals("four hundred and eighteen", converter.convert());
    }

    @Test
    void testTwoHundredAndTwo() {
        NumberConverter converter = new NumberConverter(202);
        Assertions.assertEquals("two hundred and two", converter.convert());
    }

    @Test
    void testOneHundredAndEleven() {
        NumberConverter converter = new NumberConverter(111);
        Assertions.assertEquals("one hundred and eleven", converter.convert());
    }

    @Test
    void testNineHundredAndNinetyNine() {
        NumberConverter converter = new NumberConverter(999);
        Assertions.assertEquals("nine hundred and ninety nine", converter.convert());
    }

    @Test
    void testOneThousand() {
        NumberConverter converter = new NumberConverter(1000);
        Assertions.assertEquals("one thousand", converter.convert());
    }


}
