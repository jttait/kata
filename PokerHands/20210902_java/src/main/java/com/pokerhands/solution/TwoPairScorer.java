package com.pokerhands.solution;

import java.util.List;

public class TwoPairScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        return cards.stream()
                .map(Card::getRank)
                .distinct()
                .count() == 3;
    }

    @Override
    public Score result() {
        return Score.TWO_PAIR;
    }
}
