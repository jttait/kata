package com.projecteuler.problem9;

public class Pythagoras {
    public boolean isTriplet(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            return false;
        }
        return (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a);
    }

    public int findProductOfTripletWithSum(int sum) {
        for (int c = sum; c > 0; c --) {
            for (int b = sum; b > 0; b--) {
                for (int a = sum; a > 0; a--) {
                    if (a != b && a != c && b != c && a + b + c == sum && isTriplet(a, b, c)) {
                        return a * b * c;
                    }
                }
            }
        }
        return -1;
    }
}
