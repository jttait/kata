package com.pokerhands.solution;

import java.util.List;
import java.util.stream.Collectors;

public class OnePairScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        return cards.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()))
                .containsValue(2L);
    }

    @Override
    public Score result() {
        return Score.ONE_PAIR;
    }
}
