package com.projecteuler.problem4;

public class LargestPalindromeFinder {

    PalindromeChecker palindromeChecker = new PalindromeChecker();

    public int productOf2DigitNumbers() {
        int largestPalindrome = -1;
        for (int i = 0; i <= 99; i++) {
            for (int j = 0; j <= 99; j++) {
                int product = i * j;
                if (palindromeChecker.isPalindrome(String.valueOf(product))) {
                    largestPalindrome = Math.max(product, largestPalindrome);
                }
            }
        }
        return largestPalindrome;
    }

    public int productOf3DigitNumbers() {
        int largestPalindrome = -1;
        for (int i = 0; i <= 999; i++) {
            for (int j = 0; j <= 999; j++) {
                int product = i * j;
                if (palindromeChecker.isPalindrome(String.valueOf(product))) {
                    largestPalindrome = Math.max(product, largestPalindrome);
                }
            }
        }
        return largestPalindrome;
    }

}
