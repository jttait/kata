package com.hangman.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HangmanGameTests {

    @Test
    void showBoardWith5letters() {
        HangmanGame game = new HangmanGame("hello", 5);
        Assertions.assertEquals("_____", game.show());
    }

    @Test
    void showBoardWith3letters() {
        HangmanGame game = new HangmanGame("cat", 5);
        Assertions.assertEquals("___", game.show());
    }

    @Test
    void makeCorrectGuess() {
        HangmanGame game = new HangmanGame("hello", 5);

        game.guess('h');

        Assertions.assertEquals("h____", game.show());
    }

    @Test
    void makeIncorrectGuess() {
        HangmanGame game = new HangmanGame("hello", 5);

        game.guess('a');

        Assertions.assertEquals("_____", game.show());
    }

    @Test
    void initStateToInProgress() {
        HangmanGame game = new HangmanGame("hello", 5);
        Assertions.assertEquals(GameState.IN_PROGRESS, game.getState());
    }

    @Test
    void initGameWithZeroGuesses() {
        HangmanGame game = new HangmanGame("hello", 0);
        Assertions.assertEquals(GameState.LOST, game.getState());
    }

    @Test
    void loseWhenGuessesExhausted() {
        HangmanGame game = new HangmanGame("hello", 2);

        game.guess('a');
        game.guess('b');

        Assertions.assertEquals(GameState.LOST, game.getState());
    }

    @Test
    void winWhenWordRevealed() {
        HangmanGame game = new HangmanGame("hello", 2);

        game.guess('h');
        game.guess('e');
        game.guess('l');
        game.guess('o');

        Assertions.assertEquals(GameState.WON, game.getState());
    }

    @Test
    void showWhenWordRevealed() {
        HangmanGame game = new HangmanGame("hello", 2);

        game.guess('h');
        game.guess('e');
        game.guess('l');
        game.guess('o');

        Assertions.assertEquals("hello", game.show());
    }

    @Test
    void guessingSameLetterDoesNotReduceNumGuesses() {
        HangmanGame game = new HangmanGame("hello", 1);

        game.guess('h');
        game.guess('h');

        Assertions.assertEquals(GameState.IN_PROGRESS, game.getState());
    }

}
