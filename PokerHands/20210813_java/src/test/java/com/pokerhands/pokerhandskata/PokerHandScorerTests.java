package com.pokerhands.pokerhandskata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PokerHandScorerTests {

    @Test
    void testHighCard() {
        Cards cards = new Cards(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.THREE, Suit.DIAMONDS),
                new Card(Rank.FOUR, Suit.CLUBS),
                new Card(Rank.FIVE, Suit.SPADES),
                new Card(Rank.SEVEN, Suit.HEARTS));
        Assertions.assertEquals(Score.HIGH_CARD, PokerHandScorer.score(cards));
    }

    @Test
    void testOnePair() {
        Cards cards = new Cards(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.TWO, Suit.DIAMONDS),
                new Card(Rank.FOUR, Suit.CLUBS),
                new Card(Rank.FIVE, Suit.SPADES),
                new Card(Rank.SIX, Suit.HEARTS));
        Assertions.assertEquals(Score.ONE_PAIR, PokerHandScorer.score(cards));
    }

    @Test
    void testTwoPair() {
        Cards cards = new Cards(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.TWO, Suit.DIAMONDS),
                new Card(Rank.FOUR, Suit.CLUBS),
                new Card(Rank.FOUR, Suit.SPADES),
                new Card(Rank.SIX, Suit.HEARTS));
        Assertions.assertEquals(Score.TWO_PAIR, PokerHandScorer.score(cards));
    }

    @Test
    void testThreeOfAKind() {
        Cards cards = new Cards(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.TWO, Suit.DIAMONDS),
                new Card(Rank.TWO, Suit.CLUBS),
                new Card(Rank.FOUR, Suit.SPADES),
                new Card(Rank.SIX, Suit.HEARTS));
        Assertions.assertEquals(Score.THREE_OF_A_KIND, PokerHandScorer.score(cards));
    }

    @Test
    void testStraight() {
        Cards cards = new Cards(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.THREE, Suit.DIAMONDS),
                new Card(Rank.FOUR, Suit.CLUBS),
                new Card(Rank.FIVE, Suit.SPADES),
                new Card(Rank.SIX, Suit.HEARTS));
        Assertions.assertEquals(Score.STRAIGHT, PokerHandScorer.score(cards));
    }

    @Test
    void testStraightUnsorted() {
        Cards cards = new Cards(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.THREE, Suit.DIAMONDS),
                new Card(Rank.SIX, Suit.CLUBS),
                new Card(Rank.FIVE, Suit.SPADES),
                new Card(Rank.FOUR, Suit.HEARTS));
        Assertions.assertEquals(Score.STRAIGHT, PokerHandScorer.score(cards));
    }

    @Test
    void testFlush() {
        Cards cards = new Cards(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.THREE, Suit.HEARTS),
                new Card(Rank.TEN, Suit.HEARTS),
                new Card(Rank.FIVE, Suit.HEARTS),
                new Card(Rank.FOUR, Suit.HEARTS));
        Assertions.assertEquals(Score.FLUSH, PokerHandScorer.score(cards));
    }

    @Test
    void testFullHouse() {
        Cards cards = new Cards(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.TWO, Suit.DIAMONDS),
                new Card(Rank.TWO, Suit.CLUBS),
                new Card(Rank.FIVE, Suit.HEARTS),
                new Card(Rank.FIVE, Suit.DIAMONDS));
        Assertions.assertEquals(Score.FULL_HOUSE, PokerHandScorer.score(cards));
    }

    @Test
    void testFourOfAKind() {
        Cards cards = new Cards(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.TWO, Suit.DIAMONDS),
                new Card(Rank.TWO, Suit.CLUBS),
                new Card(Rank.TWO, Suit.SPADES),
                new Card(Rank.FIVE, Suit.DIAMONDS));
        Assertions.assertEquals(Score.FOUR_OF_A_KIND, PokerHandScorer.score(cards));
    }

    @Test
    void testStraightFlush() {
        Cards cards = new Cards(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.THREE, Suit.HEARTS),
                new Card(Rank.FOUR, Suit.HEARTS),
                new Card(Rank.FIVE, Suit.HEARTS),
                new Card(Rank.SIX, Suit.HEARTS));
        Assertions.assertEquals(Score.STRAIGHT_FLUSH, PokerHandScorer.score(cards));
    }

    @Test
    void testRoyalFlush() {
        Cards cards = new Cards(
                new Card(Rank.TEN, Suit.HEARTS),
                new Card(Rank.JACK, Suit.HEARTS),
                new Card(Rank.QUEEN, Suit.HEARTS),
                new Card(Rank.KING, Suit.HEARTS),
                new Card(Rank.ACE, Suit.HEARTS));
        Assertions.assertEquals(Score.ROYAL_FLUSH, PokerHandScorer.score(cards));
    }
}
