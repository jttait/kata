package com.projecteuler.problem17;

public class NumberLettersCounter {

    public static int countNumber(int number) {
        String word = new NumberConverter(number).convert();
        int total = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                total++;
            }
        }
        System.out.printf("%d: %d\n", number, total);
        return total;
    }

    public static int countRangeClosed(int upperInclusive) {
        int total = 0;
        for (int i = 1; i <= upperInclusive; i++) {
            total += countNumber(i);
        }
        return total;
    }
}
