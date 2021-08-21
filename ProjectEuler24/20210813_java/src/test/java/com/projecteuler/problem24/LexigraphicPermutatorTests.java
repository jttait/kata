package com.projecteuler.problem24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LexigraphicPermutatorTests {

    @Test
    void testFindPivotOf0125330() {
        List<Character> characters = List.of('0', '1', '2', '5', '3', '3', '0');
        Assertions.assertEquals(2, LexigraphicPermutator.findPivot(characters));
    }

    @Test
    void testFindSmallestInSuffix() {
        List<Character> characters = List.of('0', '1', '2', '5', '3', '3', '0');
        Assertions.assertEquals(5, LexigraphicPermutator.smallestSuffix(characters, 2));
    }

    @Test
    void testReverseSuffix() {
        List<Character> original = List.of('0', '1', '3', '5', '3', '2', '0');
        List<Character> reversed = List.of('0', '1', '3', '0', '2', '3', '5');
        Assertions.assertEquals(reversed, LexigraphicPermutator.reverseSuffix(original, 2));
    }

    @Test
    void testNextLexicographicPermutation() {
        List<Character> characters = List.of('0', '1', '2', '5', '3', '3', '0');
        List<Character> expected = List.of('0', '1', '3', '0', '2', '3', '5');
        Assertions.assertEquals(expected, LexigraphicPermutator.next(characters));
    }

    @Test
    void find1stLexicographicPermutationOf012() {
        List<Character> characters = List.of('0', '1', '2');
        List<Character> expected = List.of('0', '1', '2');
        Assertions.assertEquals(expected, LexigraphicPermutator.nthPermutation(characters, 1));
    }

    @Test
    void find2ndLexicographicPermutationOf012() {
        List<Character> characters = List.of('0', '1', '2');
        List<Character> expected = List.of('0', '2', '1');
        Assertions.assertEquals(expected, LexigraphicPermutator.nthPermutation(characters, 2));
    }

    @Test
    void find1000000thLexicographicPermutationOf0123456789() {
        List<Character> characters = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        List<Character> expected = List.of('2', '7', '8', '3', '9', '1', '5', '4', '6', '0');
        Assertions.assertEquals(expected, LexigraphicPermutator.nthPermutation(characters, 1000000));
    }

}
