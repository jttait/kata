package com.pokerhands.solution;

import java.util.List;

public class RoyalFlushScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        Scorer straightFlushScorer = new StraightFlushScorer();
        return straightFlushScorer.isMatch(cards) &&
                cards.stream().map(Card::getRank).filter(x -> x == Rank.ACE).count() == 1;
    }

    @Override
    public Score result() {
        return Score.ROYAL_FLUSH;
    }
}
