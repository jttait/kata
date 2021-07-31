package com.projecteuler.problem12;

public class Triangular {

    Factoriser factoriser = new Factoriser();

    public int firstWithNDivisors(int n) {
        int i = 1;
        int triangularNumber = 0;
        while (factoriser.countFactors(triangularNumber) < n) {
            triangularNumber += i;
            i++;
        }
        return triangularNumber;
    }
}
