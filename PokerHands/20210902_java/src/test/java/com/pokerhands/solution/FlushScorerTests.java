package com.pokerhands.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FlushScorerTests {

    private FlushScorer scorer;
    private List<Card> cards;

    @BeforeEach
    void setup() {
        this.scorer = new FlushScorer();
        this.cards = new ArrayList<>();
    }

    @Test
    void testGivenFlushThenReturnsTrue() {
        cards.add(new Card(Rank.TWO, Suit.HEARTS));
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.FOUR, Suit.HEARTS));
        cards.add(new Card(Rank.FIVE, Suit.HEARTS));
        cards.add(new Card(Rank.SIX, Suit.HEARTS));
        Assertions.assertTrue(scorer.isMatch(cards));
    }

    @Test
    void testGivenHighCardThenReturnsFalse() {
        cards.add(new Card(Rank.TWO, Suit.HEARTS));
        cards.add(new Card(Rank.THREE, Suit.CLUBS));
        cards.add(new Card(Rank.FOUR, Suit.DIAMONDS));
        cards.add(new Card(Rank.FIVE, Suit.SPADES));
        cards.add(new Card(Rank.SIX, Suit.CLUBS));
        Assertions.assertFalse(scorer.isMatch(cards));
    }

    @Test
    void testGivenStraightFlushThenReturnsTrue() {
        cards.add(new Card(Rank.TWO, Suit.HEARTS));
        cards.add(new Card(Rank.THREE, Suit.HEARTS));
        cards.add(new Card(Rank.FOUR, Suit.HEARTS));
        cards.add(new Card(Rank.FIVE, Suit.HEARTS));
        cards.add(new Card(Rank.SIX, Suit.HEARTS));
        Assertions.assertTrue(scorer.isMatch(cards));
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
}