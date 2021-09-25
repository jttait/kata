package com.wordwrap.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordWrapperTests {

    @Test
    void shouldReturnOriginalStringIfSingleWordThatFitsOnLine() {
        Assertions.assertEquals("test", WordWrapper.wrap("test", 10));
    }

    @Test
    void shouldReturnOriginalStringIfTwoWordsThatFitOnLine() {
        Assertions.assertEquals("test word", WordWrapper.wrap("test word", 10));
    }

    @Test
    void shouldBreakBetweenTwoWordsIfEachFitsByItself() {
        Assertions.assertEquals("test\nword", WordWrapper.wrap("test word", 5));
    }

    @Test
    void shouldBreaksBetweenThreeWordsIfEachFitsByItselfAndBreaksAlignWithSpaces() {
        Assertions.assertEquals("test\nword\nbat", WordWrapper.wrap("test word bat", 5));
    }

    @Test
    void shouldBreaksBetweenTwoWordsIfEachFitsByItselfAndBreakDoesNotAlignWithSpace() {
        Assertions.assertEquals("test\nword", WordWrapper.wrap("test word", 6));
    }

    @Test
    void shouldReturnOriginalStringIfWordLengthEqualToMaxLineLength() {
        Assertions.assertEquals("test", WordWrapper.wrap("test", 4));
    }

    @Test
    void shouldBreaksOnlyWhereNeededWhenDoesNotAlignWithSpace() {
        Assertions.assertEquals("test word\nbat", WordWrapper.wrap("test word bat", 12));
    }

    @Test
    void shouldBreakInMiddleOfWordWhenDoesNotFitOnSingeLine() {
        Assertions.assertEquals("te-\nst", WordWrapper.wrap("test", 3));
    }

    @Test
    void shouldBreakInMiddleOfWordMultipleTimes() {
        Assertions.assertEquals("antid-\nisest-\nablis-\nhment-\narian-\nism", WordWrapper.wrap("antidisestablishmentarianism", 6));
    }

    @Test
    void shouldBreakInMiddleOfWordOnlyWhenNeeded() {
        Assertions.assertEquals("cat\nrab-\nbit", WordWrapper.wrap("cat rabbit", 4));
    }
}
