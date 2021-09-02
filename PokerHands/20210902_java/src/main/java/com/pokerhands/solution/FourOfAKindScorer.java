package com.pokerhands.solution;

import java.util.List;
import java.util.stream.Collectors;

public class FourOfAKindScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        return cards.stream()
                .collect(Collectors.groupingBy(Card::getRank, Collectors.counting()))
                .containsValue(4L);
    }

    @Override
    public Score result() {
        return Score.FOUR_OF_A_KIND;
    }
}
