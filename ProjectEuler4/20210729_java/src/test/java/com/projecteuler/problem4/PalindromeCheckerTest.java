package com.projecteuler.problem4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    void testIs123Palindrome() {
        Assertions.assertFalse(palindromeChecker.isPalindrome("123"));
    }

    @Test
    void testIs121Palindrome() {
        Assertions.assertTrue(palindromeChecker.isPalindrome("121"));
    }

    @Test
    void testIs32123Palindrome() {
        Assertions.assertTrue(palindromeChecker.isPalindrome("32123"));
    }

    @Test
    void testIsAbbaPalindrome() {
        Assertions.assertTrue(palindromeChecker.isPalindrome("abba"));
    }

    @Test
    void testIs9009Palindrome() {
        Assertions.assertTrue(palindromeChecker.isPalindrome("9009L"));
    }
}
