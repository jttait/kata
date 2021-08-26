package com.projecteuler.problem25;

import java.math.BigInteger;

public class Fibonacci {

    public static int firstFibonacciNumberWithNdigits(int n) {
        if (n == 1) { return 1; }
        BigInteger prevPrev = BigInteger.ZERO;
        BigInteger prev = BigInteger.ONE;
        BigInteger next = prevPrev.add(prev);
        int index = 1;
        while (next.toString().length() < n) {
            index++;
            prevPrev = prev;
            prev = next;
            next = prevPrev.add(prev);
        }
        return ++index;
    }

}
