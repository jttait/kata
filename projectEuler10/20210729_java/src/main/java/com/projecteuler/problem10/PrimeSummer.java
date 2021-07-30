package com.projecteuler.problem10;

import java.util.stream.LongStream;

public class PrimeSummer {

    PrimeChecker primeChecker = new PrimeChecker();

    public long sumBelow(int number) {
        return LongStream.range(2, number).filter(primeChecker::isPrime).sum();
    }
}
