package com.pokerhands.solution;

import java.util.List;
import java.util.stream.Collectors;

public class ThreeOfAKindScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        return cards.stream().collect(Collectors.groupingBy(Card::getRank, Collectors.counting())).containsValue(3L);
    }

    @Override
    public Score result() {
        return Score.THREE_OF_A_KIND;
    }
}
