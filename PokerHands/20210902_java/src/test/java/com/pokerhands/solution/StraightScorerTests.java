package com.pokerhands.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StraightScorerTests {

    private StraightScorer scorer;
    private List<Card> cards;

    @BeforeEach
    void setup() {
        this.scorer = new StraightScorer();
        this.cards = new ArrayList<>();
    }

    @Test
    void testGivenStraightThenReturnsTrue() {
        cards.add(new Card(Rank.TWO, Suit.HEARTS));
        cards.add(new Card(Rank.THREE, Suit.CLUBS));
        cards.add(new Card(Rank.FOUR, Suit.DIAMONDS));
        cards.add(new Card(Rank.FIVE, Suit.SPADES));
        cards.add(new Card(Rank.SIX, Suit.CLUBS));
        Assertions.assertTrue(scorer.isMatch(cards));
    }

    @Test
    void testGivenPairThenReturnsFalse() {
        cards.add(new Card(Rank.TWO, Suit.HEARTS));
        cards.add(new Card(Rank.TWO, Suit.CLUBS));
        cards.add(new Card(Rank.FOUR, Suit.DIAMONDS));
        cards.add(new Card(Rank.FIVE, Suit.SPADES));
        cards.add(new Card(Rank.SIX, Suit.CLUBS));
        Assertions.assertFalse(scorer.isMatch(cards));
    }
}