package com.pokerhands.pokerhandskata;

public class OnePairScorer implements Scorer {

    public boolean isMatch(Cards cards) {
        return cards.getRankOccurrences().values().stream().filter(x -> x == 2).count() == 1;
    }

    public Score result() {
        return Score.ONE_PAIR;
    }

}
