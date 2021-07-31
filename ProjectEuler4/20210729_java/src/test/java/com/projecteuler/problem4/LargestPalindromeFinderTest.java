package com.projecteuler.problem4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestPalindromeFinderTest {

    LargestPalindromeFinder largestPalindromeFinder = new LargestPalindromeFinder();

    @Test
    void findLargestPalindromeOf2DigitNumbers() {
        Assertions.assertEquals(9009, largestPalindromeFinder.productOf2DigitNumbers());
    }

    @Test
    void findLargestPalindromeOf3DigitNumbers() {
        Assertions.assertEquals(906609, largestPalindromeFinder.productOf3DigitNumbers());
    }
}
