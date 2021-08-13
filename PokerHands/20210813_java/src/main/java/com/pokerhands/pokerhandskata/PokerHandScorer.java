package com.pokerhands.pokerhandskata;

import java.util.List;

public class PokerHandScorer {

    public static Score score(Cards cards) {
        List<Scorer> scorers = List.of(
                new RoyalFlushScorer(),
                new StraightFlushScorer(),
                new FourOfAKindScorer(),
                new FullHouseScorer(),
                new FlushScorer(),
                new StraightScorer(),
                new ThreeOfAKindScorer(),
                new TwoPairScorer(),
                new OnePairScorer()
        );

        for (Scorer scorer : scorers) {
            if (scorer.isMatch(cards)) {
                return scorer.result();
            }
        }
        return Score.HIGH_CARD;
    }
}
