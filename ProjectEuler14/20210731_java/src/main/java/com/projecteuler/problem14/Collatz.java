package com.projecteuler.problem14;

import java.util.HashMap;
import java.util.Map;

public class Collatz {

    Map<Long, Long> alreadyFound;

    public Collatz() {
        this.alreadyFound = new HashMap<>();
    }

    public static long next(long number) {
        if (number % 2 == 0) {
            return number / 2;
        }
        return 3 * number + 1;
    }

    public long length(long number) {
        long initialNumber = number;
        long length = 1;
        while (number != 1) {
            if (alreadyFound.containsKey(number)) {
                alreadyFound.put(initialNumber, alreadyFound.get(number) + length);
                return alreadyFound.get(number) + length;
            }
            number = next(number);
            length++;
        }
        this.alreadyFound.put(initialNumber, length);
        return length;
    }

    public long longestBelow(long upperExclusive) {
        long longestCollatz = -1;
        long longestLength = -1;
        for (int i = 1; i < upperExclusive; i++) {
            long collatzLength = length(i);
            if (collatzLength > longestLength) {
                longestLength = collatzLength;
                longestCollatz = i;
            }
        }
        return longestCollatz;
    }

}
