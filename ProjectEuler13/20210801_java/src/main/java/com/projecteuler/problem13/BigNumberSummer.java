package com.projecteuler.problem13;

import java.math.BigInteger;
import java.util.List;

public class BigNumberSummer {

    public static BigInteger sum(List<BigInteger> numbers) {
        return numbers.stream().reduce(BigInteger.ZERO, BigInteger::add);
    }

    public static String firstDigitsOfSum(List<BigInteger> numbers, int digits) {
        String result = sum(numbers).toString();
        int end = Math.min(digits, result.length());
        return result.substring(0, end);
    }
}
