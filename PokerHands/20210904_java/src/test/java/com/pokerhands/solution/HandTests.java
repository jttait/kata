package com.pokerhands.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandTests {

    @Test
    void scoreHighCard() {
        Hand hand = new Hand(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.THREE, Suit.DIAMONDS),
                new Card(Rank.FOUR, Suit.CLUBS),
                new Card(Rank.TEN, Suit.HEARTS),
                new Card(Rank.ACE, Suit.SPADES));
        Assertions.assertEquals(Score.HIGH_CARD, hand.score());
    }

    @Test
    void scoreOnePair() {
        Hand hand = new Hand(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.TWO, Suit.DIAMONDS),
                new Card(Rank.FOUR, Suit.CLUBS),
                new Card(Rank.TEN, Suit.HEARTS),
                new Card(Rank.ACE, Suit.SPADES));
        Assertions.assertEquals(Score.ONE_PAIR, hand.score());
    }

    @Test
    void scoreTwoPair() {
        Hand hand = new Hand(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.TWO, Suit.DIAMONDS),
                new Card(Rank.FOUR, Suit.CLUBS),
                new Card(Rank.FOUR, Suit.HEARTS),
                new Card(Rank.ACE, Suit.SPADES));
        Assertions.assertEquals(Score.TWO_PAIR, hand.score());
    }

    @Test
    void scoreThreeOfAKind() {
        Hand hand = new Hand(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.TWO, Suit.DIAMONDS),
                new Card(Rank.TWO, Suit.CLUBS),
                new Card(Rank.FOUR, Suit.HEARTS),
                new Card(Rank.ACE, Suit.SPADES));
        Assertions.assertEquals(Score.THREE_OF_A_KIND, hand.score());
    }

    @Test
    void scoreStraight() {
        Hand hand = new Hand(
                new Card(Rank.TWO, Suit.HEARTS),
                new Card(Rank.THREE, Suit.DIAMONDS),
                new Card(Rank.FIVE, Suit.CLUBS),
                new Card(Rank.FOUR, Suit.HEARTS),
                new Card(Rank.SIX, Suit.SPADES));
        Assertions.assertEquals(Score.STRAIGHT, hand.score());
    }

    @Test
    void scoreStraight2() {
        Hand hand = new Hand(
                new Card(Rank.NINE, Suit.HEARTS),
                new Card(Rank.SIX, Suit.DIAMONDS),
                new Card(Rank.EIGHT, Suit.CLUBS),
                new Card(Rank.SEVEN, Suit.HEARTS),
                new Card(Rank.TEN, Suit.SPADES));
        Assertions.assertEquals(Score.STRAIGHT, hand.score());
    }

    @Test
    void scoreFlush() {
        Hand hand = new Hand(
                new Card(Rank.NINE, Suit.HEARTS),
                new Card(Rank.JACK, Suit.HEARTS),
                new Card(Rank.EIGHT, Suit.HEARTS),
                new Card(Rank.ACE, Suit.HEARTS),
                new Card(Rank.TEN, Suit.HEARTS));
        Assertions.assertEquals(Score.FLUSH, hand.score());
    }

    @Test
    void scoreFullHouse() {
        Hand hand = new Hand(
                new Card(Rank.NINE, Suit.HEARTS),
                new Card(Rank.NINE, Suit.DIAMONDS),
                new Card(Rank.NINE, Suit.CLUBS),
                new Card(Rank.SEVEN, Suit.HEARTS),
                new Card(Rank.SEVEN, Suit.SPADES));
        Assertions.assertEquals(Score.FULL_HOUSE, hand.score());
    }

    @Test
    void scoreFourOfAKind() {
        Hand hand = new Hand(
                new Card(Rank.NINE, Suit.HEARTS),
                new Card(Rank.NINE, Suit.DIAMONDS),
                new Card(Rank.NINE, Suit.CLUBS),
                new Card(Rank.NINE, Suit.SPADES),
                new Card(Rank.SEVEN, Suit.SPADES));
        Assertions.assertEquals(Score.FOUR_OF_A_KIND, hand.score());
    }

    @Test
    void scoreStraightFlush() {
        Hand hand = new Hand(
                new Card(Rank.THREE, Suit.DIAMONDS),
                new Card(Rank.FOUR, Suit.DIAMONDS),
                new Card(Rank.FIVE, Suit.DIAMONDS),
                new Card(Rank.SIX, Suit.DIAMONDS),
                new Card(Rank.SEVEN, Suit.DIAMONDS));
        Assertions.assertEquals(Score.STRAIGHT_FLUSH, hand.score());
    }
    @Test
    void scoreRoyalFlush() {
        Hand hand = new Hand(
                new Card(Rank.TEN, Suit.DIAMONDS),
                new Card(Rank.JACK, Suit.DIAMONDS),
                new Card(Rank.QUEEN, Suit.DIAMONDS),
                new Card(Rank.KING, Suit.DIAMONDS),
                new Card(Rank.ACE, Suit.DIAMONDS));
        Assertions.assertEquals(Score.ROYAL_FLUSH, hand.score());
    }


}
