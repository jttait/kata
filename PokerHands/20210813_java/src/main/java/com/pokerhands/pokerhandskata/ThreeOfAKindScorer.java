package com.pokerhands.pokerhandskata;

public class ThreeOfAKindScorer implements Scorer {

    public boolean isMatch(Cards cards) {
        return cards.getRankOccurrences().values().stream().filter(x -> x == 3).count() == 1;
    }

    public Score result() {
        return Score.THREE_OF_A_KIND;
    }

}
