package com.pokerhands.pokerhandskata;

public class FourOfAKindScorer implements Scorer {

    public boolean isMatch(Cards cards) {
        return cards.getRankOccurrences().values().stream().filter(x -> x == 4).count() == 1;
    }

    public Score result() {
        return Score.FOUR_OF_A_KIND;
    }
}
