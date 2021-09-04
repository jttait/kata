package com.integertowords.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegerToWordsTests {

    private IntegerToWords integerToWords;

    @BeforeEach
    void setup() {
        integerToWords = new IntegerToWords();
    }

    @Test
    void test1() {
        Assertions.assertEquals("one", integerToWords.convert(1));
    }

    @Test
    void test2() {
        Assertions.assertEquals("two", integerToWords.convert(2));
    }

    @Test
    void test13() {
        Assertions.assertEquals("thirteen", integerToWords.convert(13));
    }

    @Test
    void test21() {
        Assertions.assertEquals("twenty one", integerToWords.convert(21));
    }

    @Test
    void test99() {
        Assertions.assertEquals("ninety nine", integerToWords.convert(99));
    }

    @Test
    void test100() {
        Assertions.assertEquals("one hundred", integerToWords.convert(100));
    }

    @Test
    void test101() {
        Assertions.assertEquals("one hundred and one", integerToWords.convert(101));
    }

    @Test
    void test140() {
        Assertions.assertEquals("one hundred and forty", integerToWords.convert(140));
    }

    @Test
    void test999() {
        Assertions.assertEquals("nine hundred and ninety nine", integerToWords.convert(999));
    }

    @Test
    void test1000() {
        Assertions.assertEquals("one thousand", integerToWords.convert(1000));
    }

    @Test
    void test1001() {
        Assertions.assertEquals("one thousand and one", integerToWords.convert(1001));
    }

    @Test
    void test1234() {
        Assertions.assertEquals("one thousand two hundred and thirty four", integerToWords.convert(1234));
    }

    @Test
    void test11000() {
        Assertions.assertEquals("eleven thousand", integerToWords.convert(11000));
    }

    @Test
    void test200000() {
        Assertions.assertEquals("two hundred thousand", integerToWords.convert(200000));
    }

    @Test
    void test999999() {
        Assertions.assertEquals("nine hundred and ninety nine thousand nine hundred and ninety nine", integerToWords.convert(999999));
    }

    @Test
    void test1000000() {
        Assertions.assertEquals("one million", integerToWords.convert(1000000));
    }

    @Test
    void test2000000000() {
        Assertions.assertEquals("two billion", integerToWords.convert(2000000000));
    }

    @Test
    void test1987654321() {
        String expected = "one billion nine hundred and eighty seven million six hundred and fifty four thousand " +
                "three hundred and twenty one";
        Assertions.assertEquals(expected, integerToWords.convert(1987654321));
    }

}
