package com.projecteuler.problem15;

public class PathCounter {

    public static long grid(int row, int col) {
        if (row == 0 || col == 0) {
            return 1L;
        }
        return grid(row - 1, col) + grid(row, col - 1);
    }

}
