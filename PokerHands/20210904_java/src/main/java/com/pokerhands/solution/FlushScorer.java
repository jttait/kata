package com.pokerhands.solution;

import java.util.List;

public class FlushScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        return cards.stream().map(Card::getSuit).distinct().count() == 1;
    }

    @Override
    public Score result() {
        return Score.FLUSH;
    }
}
