package com.pokerhands.solution;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private final ArrayList<Card> cards;

    Hand() {
        this.cards = new ArrayList<>();
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
        scorers.add(new PairScorer());

        for (Scorer scorer : scorers) {
            if (scorer.isMatch(cards)) {
                return scorer.result();
            }
        }
        return Score.HIGH_CARD;
    }

    public void addCard(Rank rank, Suit suit) {
        this.cards.add(new Card(rank, suit));
    }
}
