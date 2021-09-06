package com.pokerhands.solution;

import java.util.List;

public class StraightFlushScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        Scorer flushScorer = new FlushScorer();
        Scorer straightScorer = new StraightScorer();
        return flushScorer.isMatch(cards) && straightScorer.isMatch(cards);
    }

    @Override
    public Score result() {
        return Score.STRAIGHT_FLUSH;
    }
}
