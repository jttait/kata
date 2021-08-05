package com.projecteuler.problem22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class WordScorerTests {

    @Test
    void testA() {
        Assertions.assertEquals(1, new WordScorer().scoreWord("A"));
    }

    @Test
    void testZ() {
        Assertions.assertEquals(26, new WordScorer().scoreWord("Z"));
    }

    @Test
    void testColin() {
        Assertions.assertEquals(53, new WordScorer().scoreWord("COLIN"));
    }

    @Test
    void testAdam() {
        Assertions.assertEquals(19, new WordScorer().scoreWord("ADAM"));
    }

    @Test
    void testListColin() {
        List<String> words = Arrays.asList("COLIN");
        Assertions.assertEquals(53, new WordScorer().scoreList(words));
    }

    @Test
    void testListAdamAndColin() {
        List<String> words = Arrays.asList("ADAM", "COLIN");
        Assertions.assertEquals(19+2*53, new WordScorer().scoreList(words));
    }

    @Test
    void testListColinAndAdam() {
        List<String> words = Arrays.asList("COLIN", "ADAM");
        Assertions.assertEquals(19+2*53, new WordScorer().scoreList(words));
    }

    @Test
    void testAdamColinTxt() {
        Assertions.assertEquals(19+2*53, new WordScorer().scoreFile("adamColin.txt"));
    }

    @Test
    void testNamesTxt() {
        Assertions.assertEquals(871198282, new WordScorer().scoreFile("names.txt"));
    }
}
