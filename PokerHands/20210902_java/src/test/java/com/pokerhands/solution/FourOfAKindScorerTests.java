package com.pokerhands.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FourOfAKindScorerTests {

    private FourOfAKindScorer scorer;
    private List<Card> cards;

    @BeforeEach
    void setup() {
        this.scorer = new FourOfAKindScorer();
        this.cards = new ArrayList<>();
    }

    @Test
    void testGivenFourOfAKindThenReturnsTrue() {
        cards.add(new Card(Rank.TWO, Suit.HEARTS));
        cards.add(new Card(Rank.TWO, Suit.CLUBS));
        cards.add(new Card(Rank.TWO, Suit.DIAMONDS));
        cards.add(new Card(Rank.TWO, Suit.SPADES));
        cards.add(new Card(Rank.FOUR, Suit.CLUBS));
        Assertions.assertTrue(scorer.isMatch(cards));
    }

    @Test
    void testGivenFullHouseThenReturnsFalse() {
        cards.add(new Card(Rank.TWO, Suit.HEARTS));
        cards.add(new Card(Rank.TWO, Suit.CLUBS));
        cards.add(new Card(Rank.TWO, Suit.DIAMONDS));
        cards.add(new Card(Rank.FIVE, Suit.SPADES));
        cards.add(new Card(Rank.FIVE, Suit.CLUBS));
        Assertions.assertFalse(scorer.isMatch(cards));
    }
}