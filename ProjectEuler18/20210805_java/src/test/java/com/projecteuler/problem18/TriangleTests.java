package com.projecteuler.problem18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class TriangleTests {

    Triangle projectEulerTriangle;

    @BeforeEach
    void setup() {
        List<List<Integer>> values = new ArrayList<>();
        values.add(Collections.singletonList(75));
        values.add(Arrays.asList(95, 64));
        values.add(Arrays.asList(17, 47, 82));
        values.add(Arrays.asList(18, 35, 87, 10));
        values.add(Arrays.asList(20, 4, 82, 47, 65));
        values.add(Arrays.asList(19, 1, 23, 75, 3, 34));
        values.add(Arrays.asList(88, 2, 77, 73, 7, 63, 67));
        values.add(Arrays.asList(99, 65, 4, 28, 6, 16, 70, 92));
        values.add(Arrays.asList(41, 41, 26, 56, 83, 40, 80, 70, 33));
        values.add(Arrays.asList(41, 48, 72, 33, 47, 32, 37, 16, 94, 29));
        values.add(Arrays.asList(53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14));
        values.add(Arrays.asList(70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57));
        values.add(Arrays.asList(91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48));
        values.add(Arrays.asList(63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31));
        values.add(Arrays.asList(4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23));
        projectEulerTriangle = new Triangle(values);
    }

    @Test
    void twoRows1() {
        List<Integer> firstRow = Collections.singletonList(75);
        List<Integer> secondRow = Arrays.asList(95, 64);
        List<List<Integer>> rows = Arrays.asList(firstRow, secondRow);
        Triangle triangle = new Triangle(rows);

        Assertions.assertEquals(75, triangle.getValue(0, 0));
    }

    @Test
    void twoRows2() {
        List<Integer> firstRow = Collections.singletonList(75);
        List<Integer> secondRow = Arrays.asList(95, 64);
        List<List<Integer>> rows = Arrays.asList(firstRow, secondRow);
        Triangle triangle = new Triangle(rows);

        Assertions.assertEquals(95, triangle.getValue(1, 0));
    }

    @Test
    void maxRoute() {
        List<Integer> firstRow = Collections.singletonList(75);
        List<Integer> secondRow = Arrays.asList(95, 64);
        List<List<Integer>> rows = Arrays.asList(firstRow, secondRow);
        Triangle triangle = new Triangle(rows);

        Assertions.assertEquals(170, triangle.sumMaxRoute());
    }

    @Test
    void maxRouteEuler() {
        Assertions.assertEquals(1074, projectEulerTriangle.sumMaxRoute());
    }
}
