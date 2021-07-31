package com.projecteuler.problem6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class SumSquareDifferenceTest {

    SumSquareDifference sumSquareDifference = new SumSquareDifference();

    @Test
    void testSumOfSquares1to10() {
        List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        Assertions.assertEquals(385, sumSquareDifference.sumOfSquares(numbers));
    }

    @Test
    void testSquareOfSums1to10() {
        List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        Assertions.assertEquals(3025, sumSquareDifference.squareOfSums(numbers));
    }

    @Test
    void testDifferenceWith1to10() {
        List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        Assertions.assertEquals(2640, sumSquareDifference.difference(numbers));
    }

    @Test
    void testDifferenceWith1to100() {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        Assertions.assertEquals(25164150, sumSquareDifference.difference(numbers));
    }


}
