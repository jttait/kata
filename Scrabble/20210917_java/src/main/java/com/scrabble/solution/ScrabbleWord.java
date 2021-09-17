package com.scrabble.solution;

import java.util.ArrayList;
import java.util.List;

public class ScrabbleWord {

    private final List<ScrabbleLetter> letters;

    ScrabbleWord() {
        this.letters = new ArrayList<>();
    }

    public void add(ScrabbleLetter letter) {
        letters.add(letter);
    }

    public void add(Tile tile, Square square) {
        letters.add(new ScrabbleLetter(tile, square));
    }

    public void add(Tile tile) {
        letters.add(new ScrabbleLetter(tile, Square.NORMAL));
    }

    public int score() {
        return getTileValues(letters) * getWordMultiplier(letters);
    }

    private int getTileValues(List<ScrabbleLetter> letters) {
        return letters.stream()
                .map(l -> l.getTileValue() * l.getSquareValue().getLetterMultiplier())
                .reduce(0, Integer::sum);
    }

    private int getWordMultiplier(List<ScrabbleLetter> letters) {
        return letters.stream()
                .map(l -> l.getSquareValue().getWordMultiplier())
                .reduce(1, (subtotal, element) -> subtotal * element);
    }
}
