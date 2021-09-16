package com.hangman.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HangmanGameTests {

    @Test
    void shouldDisplay_forUnguessedLettersOfLength5() {
        HangmanGame game = new HangmanGame("hello", 5);
        Assertions.assertEquals("_____", game.show());
    }

    @Test
    void shouldDisplay_forUnguessedLettersOfLength3() {
        HangmanGame game = new HangmanGame("cat", 5);
        Assertions.assertEquals("___", game.show());
    }

    @Test
    void shouldUpdateWordIfLetterGuessed() {
        HangmanGame game = new HangmanGame("cat", 5);
        game.guess('c');
        Assertions.assertEquals("c__", game.show());
    }

    @Test
    void shouldUpdateWordIfTwoLetterGuessed() {
        HangmanGame game = new HangmanGame("cat", 5);
        game.guess('c');
        game.guess('a');
        Assertions.assertEquals("ca_", game.show());
    }

    @Test
    void shouldNotUpdateWordIfIncorrectLetterGuessed() {
        HangmanGame game = new HangmanGame("cat", 5);
        game.guess('r');
        Assertions.assertEquals("___", game.show());
    }

    @Test
    void shouldWinGameIfAllLettersRevealed() {
        HangmanGame game = new HangmanGame("cat", 5);
        game.guess('c');
        game.guess('a');
        game.guess('t');
        Assertions.assertTrue(game.isWon());
    }

    @Test
    void shouldHaveGameNotWonOnInitialisation() {
        HangmanGame game = new HangmanGame("cat", 5);
        Assertions.assertFalse(game.isWon());
    }

    @Test
    void shouldHaveGameNotWonOnWhenUnrevealedLetters() {
        HangmanGame game = new HangmanGame("cat", 5);
        game.guess('c');
        Assertions.assertFalse(game.isWon());
    }

    @Test
    void shouldHaveGameNotLostWhenGuessesRemaining() {
        HangmanGame game = new HangmanGame("cat", 5);
        game.guess('c');
        Assertions.assertFalse(game.isLost());
    }

    @Test
    void shouldLoseGameWhenAllGuessesGone() {
        HangmanGame game = new HangmanGame("cat", 3);
        game.guess('r');
        game.guess('z');
        game.guess('m');
        Assertions.assertTrue(game.isLost());
    }

    @Test
    void shouldNotDecreaseGuessesIfSameIncorrectLetterGuessedMultipleTimes() {
        HangmanGame game = new HangmanGame("cat", 3);
        game.guess('r');
        game.guess('r');
        game.guess('r');
        Assertions.assertFalse(game.isLost());
    }

    @Test
    void shouldNotDecreaseGuessesIfSameCorrectLetterGuessedMultipleTimes() {
        HangmanGame game = new HangmanGame("cat", 3);
        game.guess('c');
        game.guess('c');
        game.guess('c');
        Assertions.assertFalse(game.isLost());
    }

}
