package com.pokerhands.solution;

import java.util.List;
import java.util.stream.Collectors;

public class StraightScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        List<Rank> sortedByRank = cards.stream().map(Card::getRank).sorted().collect(Collectors.toList());
        for (int i = 0; i < sortedByRank.size() - 1; i++) {
            if (sortedByRank.get(i).ordinal() + 1 != sortedByRank.get(i + 1).ordinal()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Score result() {
        return Score.STRAIGHT;
    }
}
