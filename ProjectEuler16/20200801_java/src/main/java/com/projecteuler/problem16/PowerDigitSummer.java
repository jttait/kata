package com.projecteuler.problem16;

import java.math.BigInteger;

public class PowerDigitSummer {

    public static long sum(BigInteger base, int power) {
        String digits = String.valueOf(base.pow(power));
        long total = 0;
        for (int i = 0; i < digits.length(); i++) {
            total += digits.charAt(i) - '0';
        }
        return total;
    }

}
