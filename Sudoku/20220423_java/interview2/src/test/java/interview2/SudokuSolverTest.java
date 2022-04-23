package interview2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuSolverTest {

    @Test
    void shouldNotBeCandidateIfNumberIsInCell() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        SudokuSolver solver = new SudokuSolver(board);
        Assertions.assertFalse(solver.isCandidate(0,0,1));
    }

    @Test
    void shouldNotBeCandidateIfNumberIsInRow() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(0,1,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        SudokuSolver solver = new SudokuSolver(board);
        Assertions.assertFalse(solver.isCandidate(0,0,1));
    }

    @Test
    void shouldNotBeCandidateIfNumberIsInCol() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        SudokuSolver solver = new SudokuSolver(board);
        Assertions.assertFalse(solver.isCandidate(0,0,1));
    }

    @Test
    void shouldBe0forStartRowIf0() {
        Assertions.assertEquals(0, SudokuSolver.getStart(0));
    }

    @Test
    void shouldBe0forStartRowIf1() {
        Assertions.assertEquals(0, SudokuSolver.getStart(1));
    }

    @Test
    void shouldBe0forStartRowIf2() {
        Assertions.assertEquals(0, SudokuSolver.getStart(2));
    }

    @Test
    void shouldBe3forStartRowIf3() {
        Assertions.assertEquals(3, SudokuSolver.getStart(3));
    }

    @Test
    void shouldNotBeCandidateIfNumberIsInSquare() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,1,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        SudokuSolver solver = new SudokuSolver(board);
        Assertions.assertFalse(solver.isCandidate(0,0,1));
    }

    @Test
    void shouldNotBeCandidateIfBoardIsEmpty() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        SudokuSolver solver = new SudokuSolver(board);
        Assertions.assertTrue(solver.isCandidate(0,0,1));
    }

    @Test
    void shouldBe0and0forEmptyBoard() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        SudokuSolver solver = new SudokuSolver(board);
        Cell expected = new Cell(0,0);
        Assertions.assertEquals(expected, solver.getNextEmptyCell());
    }

    @Test
    void shouldBe0and1ifFirstCellTaken() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        SudokuSolver solver = new SudokuSolver(board);
        Cell expected = new Cell(0,1);
        Assertions.assertEquals(expected, solver.getNextEmptyCell());
    }

    @Test
    void shouldBe1and0ifFirstRowTaken() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        SudokuSolver solver = new SudokuSolver(board);
        Cell expected = new Cell(1,0);
        Assertions.assertEquals(expected, solver.getNextEmptyCell());
    }

    @Test
    void shouldBeNullForFullBoard() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        board.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        board.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        board.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        board.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        board.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        board.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        board.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        board.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        SudokuSolver solver = new SudokuSolver(board);
        Assertions.assertNull(solver.getNextEmptyCell());
    }

    @Test
    void shouldReturnTrueForEasyBoard() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(0,0,0,2,6,0,7,0,1)));
        board.add(new ArrayList<>(Arrays.asList(6,8,0,0,7,0,0,9,0)));
        board.add(new ArrayList<>(Arrays.asList(1,9,0,0,0,4,5,0,0)));
        board.add(new ArrayList<>(Arrays.asList(8,2,0,1,0,0,0,4,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,4,6,0,2,9,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,5,0,0,0,3,0,2,8)));
        board.add(new ArrayList<>(Arrays.asList(0,0,9,3,0,0,0,7,4)));
        board.add(new ArrayList<>(Arrays.asList(0,4,0,0,5,0,0,3,6)));
        board.add(new ArrayList<>(Arrays.asList(7,0,3,0,1,8,0,0,0)));
        SudokuSolver solver = new SudokuSolver(board);
        Assertions.assertTrue(solver.solve());
    }

    @Test
    void shouldProduceCorrectSolutionForEasyBoard() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(0,0,0,2,6,0,7,0,1)));
        board.add(new ArrayList<>(Arrays.asList(6,8,0,0,7,0,0,9,0)));
        board.add(new ArrayList<>(Arrays.asList(1,9,0,0,0,4,5,0,0)));
        board.add(new ArrayList<>(Arrays.asList(8,2,0,1,0,0,0,4,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,4,6,0,2,9,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,5,0,0,0,3,0,2,8)));
        board.add(new ArrayList<>(Arrays.asList(0,0,9,3,0,0,0,7,4)));
        board.add(new ArrayList<>(Arrays.asList(0,4,0,0,5,0,0,3,6)));
        board.add(new ArrayList<>(Arrays.asList(7,0,3,0,1,8,0,0,0)));
        SudokuSolver solver = new SudokuSolver(board);
        solver.solve();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(4,3,5,2,6,9,7,8,1)));
        expected.add(new ArrayList<>(Arrays.asList(6,8,2,5,7,1,4,9,3)));
        expected.add(new ArrayList<>(Arrays.asList(1,9,7,8,3,4,5,6,2)));
        expected.add(new ArrayList<>(Arrays.asList(8,2,6,1,9,5,3,4,7)));
        expected.add(new ArrayList<>(Arrays.asList(3,7,4,6,8,2,9,1,5)));
        expected.add(new ArrayList<>(Arrays.asList(9,5,1,7,4,3,6,2,8)));
        expected.add(new ArrayList<>(Arrays.asList(5,1,9,3,2,6,8,7,4)));
        expected.add(new ArrayList<>(Arrays.asList(2,4,8,9,5,7,1,3,6)));
        expected.add(new ArrayList<>(Arrays.asList(7,6,3,4,1,8,2,5,9)));
        Assertions.assertEquals(expected, board);
    }

    @Test
    void shouldReturnTrueForNotFunBoard() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(0,2,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,6,0,0,0,0,3)));
        board.add(new ArrayList<>(Arrays.asList(0,7,4,0,8,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,3,0,0,2)));
        board.add(new ArrayList<>(Arrays.asList(0,8,0,0,4,0,0,1,0)));
        board.add(new ArrayList<>(Arrays.asList(6,0,0,5,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,1,0,7,8,0)));
        board.add(new ArrayList<>(Arrays.asList(5,0,0,0,0,9,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,4,0)));
        SudokuSolver solver = new SudokuSolver(board);
        Assertions.assertTrue(solver.solve());
    }

    @Test
    void shouldProduceCorrectSolutionForNotFunBoard() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(0,2,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,6,0,0,0,0,3)));
        board.add(new ArrayList<>(Arrays.asList(0,7,4,0,8,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,3,0,0,2)));
        board.add(new ArrayList<>(Arrays.asList(0,8,0,0,4,0,0,1,0)));
        board.add(new ArrayList<>(Arrays.asList(6,0,0,5,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,1,0,7,8,0)));
        board.add(new ArrayList<>(Arrays.asList(5,0,0,0,0,9,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,4,0)));
        SudokuSolver solver = new SudokuSolver(board);
        solver.solve();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1,2,6,4,3,7,9,5,8)));
        expected.add(new ArrayList<>(Arrays.asList(8,9,5,6,2,1,4,7,3)));
        expected.add(new ArrayList<>(Arrays.asList(3,7,4,9,8,5,1,2,6)));
        expected.add(new ArrayList<>(Arrays.asList(4,5,7,1,9,3,8,6,2)));
        expected.add(new ArrayList<>(Arrays.asList(9,8,3,2,4,6,5,1,7)));
        expected.add(new ArrayList<>(Arrays.asList(6,1,2,5,7,8,3,9,4)));
        expected.add(new ArrayList<>(Arrays.asList(2,6,9,3,1,4,7,8,5)));
        expected.add(new ArrayList<>(Arrays.asList(5,4,8,7,6,9,2,3,1)));
        expected.add(new ArrayList<>(Arrays.asList(7,3,1,8,5,2,6,4,9)));
        Assertions.assertEquals(expected, board);
    }

    @Test
    void shouldReturnTrueForEmptyBoard() {
        List<List<Integer>> board = new ArrayList<>();
        board.add(new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        board.add(new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0)));
        SudokuSolver solver = new SudokuSolver(board);
        Assertions.assertTrue(solver.solve());
    }
}
