package com.projecteuler.problem7;

public class PrimeFinder {

    PrimeChecker primeChecker = new PrimeChecker();

    public int findNthPrime(int target) {
        int counter = 0;
        int number = 2;
        while (counter < target) {
            if (primeChecker.isPrime(number)) {
                counter++;
            }
            if (counter < target) {
                number++;
            }
        }
        return number;
    }
}
