package com.wordwrap.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordWrapperTests {

    @Test
    void shouldReturnWordIfSingleWordFitsWithinLine() {
        WordWrapper wrapper = new WordWrapper("test");
        Assertions.assertEquals("test", wrapper.wrap(10));
    }

    @Test
    void shouldReturnWordIfSingleWordLongerThanMaxLineLength() {
        WordWrapper wrapper = new WordWrapper("test");
        Assertions.assertEquals("test", wrapper.wrap(3));
    }

    @Test
    void shouldReturnSameStringIfTwoWordsFitInLine() {
        WordWrapper wrapper = new WordWrapper("word test");
        Assertions.assertEquals("word test", wrapper.wrap(10));
    }

    @Test
    void shouldInsertNewLineIfTwoWordsDoNotFitOnSameLine() {
        WordWrapper wrapper = new WordWrapper("word test");
        Assertions.assertEquals("word\ntest", wrapper.wrap(6));
    }

    @Test
    void shouldSplitInputOnToThreeLines() {
        WordWrapper wrapper = new WordWrapper("word test bat");
        Assertions.assertEquals("word\ntest\nbat", wrapper.wrap(6));
    }

    @Test
    void shouldSplitInputOnToThreeLinesIfMaxLineLengthLessThanLine() {
        WordWrapper wrapper = new WordWrapper("word test bat");
        Assertions.assertEquals("word\ntest\nbat", wrapper.wrap(2));
    }

    @Test
    void shouldNotSplitIfTwoWordsCanFitOnSameLine() {
        WordWrapper wrapper = new WordWrapper("word test bat");
        Assertions.assertEquals("word test\nbat", wrapper.wrap(10));
    }
}
