package interview2;

import java.util.List;

public class SudokuSolver {

    private List<List<Integer>> board;

    public SudokuSolver(List<List<Integer>> board) {
        this.board = board;
    }

    public boolean isCandidate(int row, int col, int num) {
        if (isNumberAlreadyInRow(row, num)) {
            return false;
        }
        if (isNumberAlreadyInColumn(col, num)) {
            return false;
        }
        if (isNumberAlreadyInSquare(row, col, num))  {
            return false;
        }
        return true;
    }

    private boolean isNumberAlreadyInRow(int row, int num) {
        for (int i = 0; i < 9; i++) {
            if (board.get(row).get(i) == num) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberAlreadyInColumn(int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board.get(i).get(col) == num) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberAlreadyInSquare(int row, int col, int num) {
        int startRow = getStart(row);
        int startCol = getStart(col);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.get(startRow + i).get(startCol + j) == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getStart(int rowOrCol) {
        return rowOrCol - rowOrCol % 3;
    }

    public Cell getNextEmptyCell() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board.get(i).get(j) == 0) {
                    return new Cell(i, j);
                }
            }
        }
        return null;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(board.get(i).get(j));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean solve() {
        Cell cell = getNextEmptyCell();

        if (cell == null) {
            return true;
        }

        for (int i = 1; i <= 9; i++) {
            if (isCandidate(cell.getRow(), cell.getCol(), i)) {
                board.get(cell.getRow()).set(cell.getCol(), i);
                boolean result = solve();
                if (result) {
                    return true;
                }
                board.get(cell.getRow()).set(cell.getCol(), 0);
            }
        }

        return false;
    }
}
