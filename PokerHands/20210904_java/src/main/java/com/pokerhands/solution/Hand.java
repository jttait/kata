package com.pokerhands.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {

    private final List<Card> cards;

    Hand(Card first, Card second, Card third, Card fourth, Card fifth) {
        this.cards = Arrays.asList(first, second, third, fourth, fifth);
    }

    public Score score() {
        List<Scorer> scorers = new ArrayList<>();
        scorers.add(new RoyalFlushScorer());
        scorers.add(new StraightFlushScorer());
        scorers.add(new FourOfAKindScorer());
        scorers.add(new FullHouseScorer());
        scorers.add(new FlushScorer());
        scorers.add(new StraightScorer());
        scorers.add(new ThreeOfAKindScorer());
        scorers.add(new TwoPairScorer());
        scorers.add(new OnePairScorer());
        for (Scorer scorer : scorers) {
            if (scorer.isMatch(this.cards)) {
                return scorer.result();
            }
        }
        return Score.HIGH_CARD;
    }
}
