package com.pokerhands.pokerhandskata;

public class TwoPairScorer implements Scorer {

    public boolean isMatch(Cards cards) {
        return cards.getRankOccurrences().values().stream().filter(x -> x == 2).count() == 2;
    }

    public Score result() {
        return Score.TWO_PAIR;
    }

}
