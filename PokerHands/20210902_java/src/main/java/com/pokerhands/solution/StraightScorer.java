package com.pokerhands.solution;

import java.util.List;
import java.util.stream.Collectors;

public class StraightScorer implements Scorer {

    @Override
    public boolean isMatch(List<Card> cards) {
        List<Rank> ranks = cards.stream()
                .map(Card::getRank)
                .sorted()
                .collect(Collectors.toList());
        for (int i = 0; i < ranks.size() - 1; i++) {
            if (ranks.get(i).compareTo(ranks.get(i + 1)) != -1) {
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
