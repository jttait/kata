package com.scrabble.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ScrabbleWordTests {

    ScrabbleWord word;

    @BeforeEach
    void setup() {
        word = new ScrabbleWord();
    }

    @Test
    void shouldScore3whenWordIsIan() {
        word.add(Tile.I);
        word.add(Tile.A);
        word.add(Tile.N);
        Assertions.assertEquals(3, word.score());
    }

    @Test
    void shouldScore4whenWordIsTill() {
        word.add(Tile.T);
        word.add(Tile.I);
        word.add(Tile.L);
        word.add(Tile.L);
        Assertions.assertEquals(4, word.score());
    }

    @Test
    void shouldScore12whenWordIsZoo() {
        word.add(Tile.Z);
        word.add(Tile.O);
        word.add(Tile.O);
        Assertions.assertEquals(12, word.score());
    }

    @Test
    void shouldScore24whenWordIsZooAndDoubleWordScore() {
        word.add(Tile.Z, Square.DOUBLE_WORD_SCORE);
        word.add(Tile.O);
        word.add(Tile.O);
        Assertions.assertEquals(24, word.score());
    }

    @Test
    void shouldScore36whenWordIsZooAndTripleWordScore() {
        word.add(Tile.Z, Square.TRIPLE_WORD_SCORE);
        word.add(Tile.O);
        word.add(Tile.O);
        Assertions.assertEquals(36, word.score());
    }

    @Test
    void shouldScore22whenWordIsZooAndDoubleLetterScoreOnZ() {
        word.add(Tile.Z, Square.DOUBLE_LETTER_SCORE);
        word.add(Tile.O);
        word.add(Tile.O);
        Assertions.assertEquals(22, word.score());
    }

    @Test
    void shouldScore22whenWordIsZooAndTripleLetterScoreOnZ() {
        word.add(Tile.Z, Square.TRIPLE_LETTER_SCORE);
        word.add(Tile.O, Square.NORMAL);
        word.add(Tile.O, Square.NORMAL);
        Assertions.assertEquals(32, word.score());
    }

    @Test
    void shouldScore108whenWordIsZooAndTwoTripleWordScores() {
        word.add(Tile.Z, Square.TRIPLE_WORD_SCORE);
        word.add(Tile.O, Square.TRIPLE_WORD_SCORE);
        word.add(Tile.O);
        Assertions.assertEquals(108, word.score());
    }

    @Test
    void shouldScore16whenWordIsZooAndTwoTripleLetterScores() {
        word.add(Tile.Z);
        word.add(Tile.O, Square.TRIPLE_LETTER_SCORE);
        word.add(Tile.O, Square.TRIPLE_LETTER_SCORE);
        Assertions.assertEquals(16, word.score());
    }

}
