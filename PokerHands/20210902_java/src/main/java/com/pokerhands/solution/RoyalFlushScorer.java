package com.pokerhands.solution;

import java.util.List;
import java.util.stream.Collectors;

public class RoyalFlushScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        StraightFlushScorer straightFlushScorer = new StraightFlushScorer();
        boolean containsAce = cards.stream().map(Card::getRank).collect(Collectors.toList()).contains(Rank.ACE);
        return straightFlushScorer.isMatch(cards) && containsAce;
    }

    @Override
    public Score result() {
        return Score.ROYAL_FLUSH;
    }
}
