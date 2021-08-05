package com.projecteuler.problem18;

import java.util.List;

public class Triangle {

    private List<List<Integer>> rows;

    public Triangle(List<List<Integer>> rows) {
        this.rows = rows;
    }

    public int getValue(int row, int col) {
        return rows.get(row).get(col);
    }

    public int sumMaxRoute() {
        return sumRoute(0, 0, 0);
    }

    public int sumRoute(int row, int col, int total) {
        total += getValue(row, col);
        if (row >= rows.size() - 1) {
            return total;
        }
        int leftTotal = sumRoute(row + 1, col, total);
        int rightTotal = sumRoute(row + 1, col + 1, total);
        return Math.max(leftTotal, rightTotal);
    }
}
