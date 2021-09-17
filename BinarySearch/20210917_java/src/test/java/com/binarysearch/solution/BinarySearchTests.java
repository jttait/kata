package com.binarysearch.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BinarySearchTests {

    @Test
    void shouldReturn2whenSearchingFor3() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = BinarySearch.search(list, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    void shouldReturn3whenSearchingFor4() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = BinarySearch.search(list, 4);
        Assertions.assertEquals(3, result);
    }

    @Test
    void shouldReturnCorrectIndexWhenTargetIsLastElement() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = BinarySearch.search(list, 10);
        Assertions.assertEquals(9, result);
    }

    @Test
    void shouldReturnMinusOneWhenTargetNotInList() {
        List<Integer> list = List.of(0, 2, 4, 6, 8, 10, 12, 14, 16, 18);
        int result = BinarySearch.search(list, 9);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void shouldReturnCorrectInIndexWhenListIsMultiplesOf2() {
        List<Integer> list = List.of(0, 2, 4, 6, 8, 10, 12, 14, 16, 18);
        int result = BinarySearch.search(list, 10);
        Assertions.assertEquals(5, result);
    }
}
