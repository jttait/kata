package com.pokerhands.solution;

import java.util.List;

public class StraightFlushScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        StraightScorer straightScorer = new StraightScorer();
        FlushScorer flushScorer = new FlushScorer();
        return straightScorer.isMatch(cards) && flushScorer.isMatch(cards);
    }

    @Override
    public Score result() {
        return Score.STRAIGHT_FLUSH;
    }
}
