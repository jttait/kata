package com.pokerhands.pokerhandskata;

public class StraightFlushScorer implements Scorer {

    public boolean isMatch(Cards cards) {
        FlushScorer flushScorer = new FlushScorer();
        StraightScorer straightScorer = new StraightScorer();

        return flushScorer.isMatch(cards) && straightScorer.isMatch(cards);
    }

    public Score result() {
        return Score.STRAIGHT_FLUSH;
    }

}
