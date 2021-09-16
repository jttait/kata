package com.hangman.solution;

import java.util.ArrayList;
import java.util.List;

public class HangmanGame {

    private final String word;
    private int guesses;
    private String state;
    private final List<Character> incorrectGuesses;

    public HangmanGame(String word, int guesses) {
        this.word = word;
        this.guesses = guesses;
        this.state = "_".repeat(this.word.length());
        this.incorrectGuesses = new ArrayList<>();
    }

    public String show() {
        return this.state;
    }

    public void guess(char letter) {
        updateAvailableGuesses(letter);
        revealAllInstancesOfLetter(letter);
    }

    private void updateAvailableGuesses(char letter) {
        if (this.word.indexOf(letter) == -1 && !this.incorrectGuesses.contains(letter)) {
            this.incorrectGuesses.add(letter);
            this.guesses--;
        }
    }

    private void revealAllInstancesOfLetter(char letter) {
        StringBuilder sb = new StringBuilder(this.state);
        for (int i = 0; i < word.length(); i++) {
            revealLetterIfGuessed(i, letter, sb);
        }
        this.state = sb.toString();
    }

    private void revealLetterIfGuessed(int index, char letter, StringBuilder sb) {
        if (word.charAt(index) == letter) {
            sb.setCharAt(index, letter);
        }
    }

    public boolean isWon() {
        return !this.state.contains("_");
    }

    public boolean isLost() {
        return this.guesses <= 0;
    }
}
