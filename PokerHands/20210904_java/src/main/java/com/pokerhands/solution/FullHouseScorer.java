package com.pokerhands.solution;

import java.util.List;

public class FullHouseScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        Scorer onePairScorer = new OnePairScorer();
        Scorer threeOfAKindScorer = new ThreeOfAKindScorer();
        return onePairScorer.isMatch(cards) && threeOfAKindScorer.isMatch(cards);
    }

    @Override
    public Score result() {
        return Score.FULL_HOUSE;
    }
}
