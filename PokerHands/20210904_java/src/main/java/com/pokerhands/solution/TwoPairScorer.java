package com.pokerhands.solution;

import java.util.List;
import java.util.stream.Collectors;

public class TwoPairScorer implements Scorer {
    @Override
    public boolean isMatch(List<Card> cards) {
        return cards.stream().collect(Collectors.groupingBy(Card::getRank, Collectors.counting())).containsValue(2L) &&
                cards.stream().map(Card::getRank).distinct().count() == 3;
    }

    @Override
    public Score result() {
        return Score.TWO_PAIR;
    }
}
