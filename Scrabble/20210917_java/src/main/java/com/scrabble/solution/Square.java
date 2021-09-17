package com.scrabble.solution;

public enum Square {
    TRIPLE_WORD_SCORE(1, 3),
    DOUBLE_WORD_SCORE(1, 2),
    TRIPLE_LETTER_SCORE(3, 1),
    DOUBLE_LETTER_SCORE(2, 1),
    NORMAL(1, 1);

    private int letterMultiplier;
    private int wordMultiplier;

    Square(int letterMultiplier, int wordMultiplier) {
        this.letterMultiplier = letterMultiplier;
        this.wordMultiplier = wordMultiplier;
    }

    public int getLetterMultiplier() {
        return this.letterMultiplier;
    }

    public int getWordMultiplier() {
        return this.wordMultiplier;
    }
}
