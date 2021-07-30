package com.projectEuler.problem1;

import java.util.stream.IntStream;

public class MultipleSummer {

    public int sumMultiplesOf3And5Below(int limit) {
        return IntStream.range(0, limit).filter(this::isMultipleOf3And5).sum();
    }

    private boolean isMultipleOf3And5(int number) {
        return number % 3 == 0 || number % 5 == 0;
    }

}
