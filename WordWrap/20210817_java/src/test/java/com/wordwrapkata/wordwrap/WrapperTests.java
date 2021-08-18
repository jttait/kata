package com.wordwrapkata.wordwrap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WrapperTests {

    @Test
    void testEmptyString() {
        Assertions.assertEquals("", Wrapper.wrap("", 10));
    }

    @Test
    void testStringShorterThanMaxLineLength() {
        Assertions.assertEquals("hello", Wrapper.wrap("hello", 10));
    }

    @Test
    void testOneLineBreak() {
        Assertions.assertEquals("hello\nworld", Wrapper.wrap("hello world", 5));
    }

    @Test
    void testTwoLineBreaks() {
        Assertions.assertEquals("hello\nworld\ncat", Wrapper.wrap("hello world cat", 5));
    }

    @Test
    void testLineBreakAndSpace() {
        Assertions.assertEquals("hello world\ncat", Wrapper.wrap("hello world cat", 11));
    }

    @Test
    void testLengthInMiddleOfWord() {
        Assertions.assertEquals("hello\nworld", Wrapper.wrap("hello world", 7));
    }

    @Test
    void testLengthLessThanWord() {
        Assertions.assertEquals("hel\nlo", Wrapper.wrap("hello", 3));
    }

    @Test
    void testWordsBothShorterAndLongerThanMaxLineLen() {
        Assertions.assertEquals("hel\nlo\ncat", Wrapper.wrap("hello cat", 3));
    }

    @Test
    void WrapNullReturnsEmptyString() {
        Assertions.assertEquals("", Wrapper.wrap(null, 10));
    }

    @Test
    void OneShortWordDoesNotWrap() {
        Assertions.assertEquals("word", Wrapper.wrap("word", 5));
    }

    @Test
    void TwoWordsLongerThanLimitShouldWrap() {
        Assertions.assertEquals("word\nword", Wrapper.wrap("word word", 6));
    }

    @Test
    void ThreeWordsJustOverTheLimitShouldWrapAtSecondWord() {
        Assertions.assertEquals("word word\nword", Wrapper.wrap("word word word", 9));
    }

    @Test
    void WordLongerThanLengthBreaksAtLength() {
        Assertions.assertEquals("long\nword", Wrapper.wrap("longword", 4));
    }

    @Test
    void WordEvenLongerThanLengthBreaksAtLength() {
        Assertions.assertEquals("longer\nword", Wrapper.wrap("longerword", 6));
    }

    @Test
    void WordLongerThanTwiceLengthShouldBreakTwice() {
        Assertions.assertEquals("very\nlong\nword", Wrapper.wrap("verylongword", 4));
    }

    @Test
    void ThreeWordsEachLongerThanLimitShouldWrap() {
        Assertions.assertEquals("word\nword\nword", Wrapper.wrap("word word word", 6));
    }

    @Test
    void ThreeWordsJustOverTheLimitShouldBreakAtSecond() {
        Assertions.assertEquals("word word\nword", Wrapper.wrap("word word word", 11));
    }

    @Test
    void TwoWordsTheFirstEndingAtTheLimit() {
        Assertions.assertEquals("word\nword", Wrapper.wrap("word word", 4));
    }

}
