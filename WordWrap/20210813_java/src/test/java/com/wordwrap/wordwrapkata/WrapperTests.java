package com.wordwrap.wordwrapkata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WrapperTests {

    @Test
    void testEmptyString() {
        Assertions.assertEquals("", Wrapper.wrap("", 5));
    }

    @Test
    void testSpace() {
        Assertions.assertEquals(" ", Wrapper.wrap(" ", 5));
    }

    @Test
    void testBreakAtSpace() {
        Assertions.assertEquals("hello\nworld", Wrapper.wrap("hello world", 5));
    }

    @Test
    void testSingleLine() {
        Assertions.assertEquals("hello world", Wrapper.wrap("hello world", 20));
    }

    @Test
    void testBreakAndSpace() {
        Assertions.assertEquals("hello world\nrabbit", Wrapper.wrap("hello world rabbit", 12));
    }

    @Test
    void testThreeLines() {
        Assertions.assertEquals("hello\nworld\nrabbit", Wrapper.wrap("hello world rabbit", 7));
    }

    @Test
    void testSplitWord() {
        Assertions.assertEquals("hel\nlo", Wrapper.wrap("hello", 3));
    }

    @Test
    void testSplitWords() {
        Assertions.assertEquals("hel\nlo\nwor\nld", Wrapper.wrap("hello world", 3));
    }

}
