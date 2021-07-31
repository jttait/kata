package com.projecteuler.problem11;

import java.util.List;

public class GridProductFinder {

    private List<List<Integer>> grid;

    public GridProductFinder(List<List<Integer>> grid) {
        this.grid = grid;
    }

    public boolean inGrid(int row, int col) {
        return (row >= 0 && row < grid.size() && col >= 0 && col < grid.get(0).size());
    }

    public int direction(int row, int col, int numAdjacent, int rowIncrementer, int colIncrementer) {
        int product = 1;
        int counter = 0;
        while (counter < numAdjacent && this.inGrid(row, col)) {
            product *= this.grid.get(row).get(col);
            col += colIncrementer;
            row += rowIncrementer;
            counter++;
        }
        return product;
    }

    public int maxForCell(int row, int col, int numAdjacent) {
        int maxProduct = 0;
        maxProduct = Math.max(maxProduct, direction(row, col, numAdjacent, 0, 1));
        maxProduct = Math.max(maxProduct, direction(row, col, numAdjacent, 1, 0));
        maxProduct = Math.max(maxProduct, direction(row, col, numAdjacent, 1, 1));
        maxProduct = Math.max(maxProduct, direction(row, col, numAdjacent, -1, 1));
        return maxProduct;
    }

    public int maxForGrid(int numAdjacent) {
        int maxProduct = 0;
        for (int row = 0; row < grid.size(); row++) {
            for (int col = 0; col < grid.get(0).size(); col++) {
                maxProduct = Math.max(maxProduct, maxForCell(row, col, numAdjacent));
            }
        }
        return maxProduct;
    }

}
