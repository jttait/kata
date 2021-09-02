package com.pokerhands.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FullHouseScorerTests {

    private FullHouseScorer scorer;
    private List<Card> cards;

    @BeforeEach
    void setup() {
        this.scorer = new FullHouseScorer();
        this.cards = new ArrayList<>();
    }

    @Test
    void testGivenFullHouseThenReturnsTrue() {
        cards.add(new Card(Rank.TWO, Suit.HEARTS));
        cards.add(new Card(Rank.TWO, Suit.CLUBS));
        cards.add(new Card(Rank.FOUR, Suit.DIAMONDS));
        cards.add(new Card(Rank.FOUR, Suit.SPADES));
        cards.add(new Card(Rank.FOUR, Suit.CLUBS));
        Assertions.assertTrue(scorer.isMatch(cards));
    }

    @Test
    void testGivenHighCardThenReturnsFalse() {
        cards.add(new Card(Rank.TWO, Suit.HEARTS));
        cards.add(new Card(Rank.TEN, Suit.CLUBS));
        cards.add(new Card(Rank.FOUR, Suit.DIAMONDS));
        cards.add(new Card(Rank.FIVE, Suit.SPADES));
        cards.add(new Card(Rank.SIX, Suit.CLUBS));
        Assertions.assertFalse(scorer.isMatch(cards));
    }
}