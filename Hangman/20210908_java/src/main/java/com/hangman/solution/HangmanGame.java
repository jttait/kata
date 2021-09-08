package com.hangman.solution;

public class HangmanGame {
    private final String word;
    private int numGuesses;
    private String board;
    private GameState gameState;

    public HangmanGame(String word, int numGuesses) {
        this.word = word;
        this.numGuesses = numGuesses;

        this.board = "_".repeat(word.length());
        this.gameState = (numGuesses > 0) ? GameState.IN_PROGRESS : GameState.LOST;
    }

    public String show() {
        return this.board;
    }

    public void guess(char guess) {
        if (this.gameState != GameState.IN_PROGRESS) {
            return;
        }

        StringBuilder sb = new StringBuilder();
        boolean guessInWord = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                guessInWord = true;
                sb.append(guess);
            } else {
                sb.append(this.board.charAt(i));
            }
        }

        this.numGuesses = (guessInWord) ? this.numGuesses : this.numGuesses - 1;

        this.board = sb.toString();

        updateGameState();
    }

    public GameState getState() {
        return this.gameState;
    }

    private void updateGameState() {
        if (!this.board.contains("_")) {
            this.gameState = GameState.WON;
        } else if (numGuesses <= 0) {
            this.gameState = GameState.LOST;
        }
    }
}
