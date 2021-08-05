package com.projecteuler.problem20;

import java.math.BigInteger;

public class Factorial {

    private BigInteger number;

    public Factorial(BigInteger number) {
        this.number = number;
    }

    public BigInteger factorial() {
        BigInteger factorial = BigInteger.ONE;
        for (BigInteger i = number; i.intValue() > 0; i = i.subtract(BigInteger.ONE)) {
            factorial = factorial.multiply(i);
        }
        return factorial;
    }

    public BigInteger sumFactorialDigits() {
        BigInteger factorial = factorial();
        String digits = String.valueOf(factorial);
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < digits.length(); i++) {
            sum = sum.add(new BigInteger(String.valueOf(digits.charAt(i))));
        }
        return sum;
    }

}
