package com.pokerhands.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class RoyalFlushScorerTests {

    private RoyalFlushScorer scorer;
    private List<Card> cards;

    @BeforeEach
    void setup() {
        this.scorer = new RoyalFlushScorer();
        this.cards = new ArrayList<>();
    }

    @Test
    void testGivenRoyalFlushThenReturnsTrue() {
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.JACK, Suit.HEARTS));
        cards.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards.add(new Card(Rank.KING, Suit.HEARTS));
        cards.add(new Card(Rank.ACE, Suit.HEARTS));
        Assertions.assertTrue(scorer.isMatch(cards));
    }

    @Test
    void testGivenStraightThenReturnsFalse() {
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.JACK, Suit.CLUBS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.KING, Suit.SPADES));
        cards.add(new Card(Rank.ACE, Suit.CLUBS));
        Assertions.assertFalse(scorer.isMatch(cards));
    }
}