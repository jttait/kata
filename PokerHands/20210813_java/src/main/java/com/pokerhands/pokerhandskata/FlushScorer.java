package com.pokerhands.pokerhandskata;

public class FlushScorer implements Scorer {

    public boolean isMatch(Cards cards) {
        return cards.getSuitOccurrences().values().stream().filter(x -> x == 5).count() == 1;
    }

    public Score result() {
        return Score.FLUSH;
    }
}
