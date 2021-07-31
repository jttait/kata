package com.projecteuler.problem10;

public class PrimeChecker {

    public boolean isPrime(long number) {
        if (number <= 3) {
            return number > 1;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        long i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
}
