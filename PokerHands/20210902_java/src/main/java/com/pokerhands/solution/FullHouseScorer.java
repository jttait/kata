package com.pokerhands.solution;

import java.util.List;
import java.util.stream.Collectors;

public class FullHouseScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        ThreeOfAKindScorer threeOfAKindScorer = new ThreeOfAKindScorer();
        PairScorer pairScorer = new PairScorer();
        return pairScorer.isMatch(cards) && threeOfAKindScorer.isMatch(cards);
    }

    @Override
    public Score result() {
        return Score.FULL_HOUSE;
    }
}
