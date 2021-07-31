package com.projecteuler.problem6;

import java.util.List;

public class SumSquareDifference {

    public int sumOfSquares(List<Integer> numbers) {
        return numbers.stream().map(number -> number * number).reduce(0, Integer::sum);
    }

    public int squareOfSums(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0, Integer::sum);
        return sum * sum;
    }

    public int difference(List<Integer> numbers) {
        return Math.abs(sumOfSquares(numbers) - squareOfSums(numbers));
    }
}
