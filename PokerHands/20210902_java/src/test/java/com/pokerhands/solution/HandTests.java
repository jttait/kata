package com.pokerhands.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandTests {

    @Test
    void testHighCard() {
        Hand hand = new Hand();
        hand.addCard(Rank.TWO, Suit.HEARTS);
        hand.addCard(Rank.KING, Suit.CLUBS);
        hand.addCard(Rank.FOUR, Suit.DIAMONDS);
        hand.addCard(Rank.FIVE, Suit.SPADES);
        hand.addCard(Rank.SIX, Suit.CLUBS);
        Assertions.assertEquals(Score.HIGH_CARD, hand.score());
    }

    @Test
    void testPair() {
        Hand hand = new Hand();
        hand.addCard(Rank.TWO, Suit.HEARTS);
        hand.addCard(Rank.TWO, Suit.CLUBS);
        hand.addCard(Rank.FOUR, Suit.DIAMONDS);
        hand.addCard(Rank.FIVE, Suit.SPADES);
        hand.addCard(Rank.SIX, Suit.CLUBS);
        Assertions.assertEquals(Score.PAIR, hand.score());
    }

    @Test
    void testTwoPair() {
        Hand hand = new Hand();
        hand.addCard(Rank.TWO, Suit.HEARTS);
        hand.addCard(Rank.TWO, Suit.CLUBS);
        hand.addCard(Rank.FOUR, Suit.DIAMONDS);
        hand.addCard(Rank.FOUR, Suit.SPADES);
        hand.addCard(Rank.SIX, Suit.CLUBS);
        Assertions.assertEquals(Score.TWO_PAIR, hand.score());
    }

    @Test
    void testThreeOfAKind() {
        Hand hand = new Hand();
        hand.addCard(Rank.TWO, Suit.HEARTS);
        hand.addCard(Rank.TWO, Suit.CLUBS);
        hand.addCard(Rank.TWO, Suit.DIAMONDS);
        hand.addCard(Rank.FOUR, Suit.SPADES);
        hand.addCard(Rank.SIX, Suit.CLUBS);
        Assertions.assertEquals(Score.THREE_OF_A_KIND, hand.score());
    }

    @Test
    void testStraight() {
        Hand hand = new Hand();
        hand.addCard(Rank.TWO, Suit.HEARTS);
        hand.addCard(Rank.THREE, Suit.CLUBS);
        hand.addCard(Rank.FOUR, Suit.DIAMONDS);
        hand.addCard(Rank.FIVE, Suit.SPADES);
        hand.addCard(Rank.SIX, Suit.CLUBS);
        Assertions.assertEquals(Score.STRAIGHT, hand.score());
    }

    @Test
    void testFlush() {
        Hand hand = new Hand();
        hand.addCard(Rank.TWO, Suit.HEARTS);
        hand.addCard(Rank.KING, Suit.HEARTS);
        hand.addCard(Rank.FOUR, Suit.HEARTS);
        hand.addCard(Rank.TEN, Suit.HEARTS);
        hand.addCard(Rank.SIX, Suit.HEARTS);
        Assertions.assertEquals(Score.FLUSH, hand.score());
    }

    @Test
    void testFullHouse() {
        Hand hand = new Hand();
        hand.addCard(Rank.TWO, Suit.HEARTS);
        hand.addCard(Rank.TWO, Suit.CLUBS);
        hand.addCard(Rank.TWO, Suit.DIAMONDS);
        hand.addCard(Rank.FIVE, Suit.SPADES);
        hand.addCard(Rank.FIVE, Suit.CLUBS);
        Assertions.assertEquals(Score.FULL_HOUSE, hand.score());
    }

    @Test
    void testFourOfAKind() {
        Hand hand = new Hand();
        hand.addCard(Rank.TWO, Suit.HEARTS);
        hand.addCard(Rank.TWO, Suit.CLUBS);
        hand.addCard(Rank.TWO, Suit.DIAMONDS);
        hand.addCard(Rank.TWO, Suit.SPADES);
        hand.addCard(Rank.FIVE, Suit.CLUBS);
        Assertions.assertEquals(Score.FOUR_OF_A_KIND, hand.score());
    }

    @Test
    void testStraightFlush() {
        Hand hand = new Hand();
        hand.addCard(Rank.TWO, Suit.HEARTS);
        hand.addCard(Rank.THREE, Suit.HEARTS);
        hand.addCard(Rank.FOUR, Suit.HEARTS);
        hand.addCard(Rank.FIVE, Suit.HEARTS);
        hand.addCard(Rank.SIX, Suit.HEARTS);
        Assertions.assertEquals(Score.STRAIGHT_FLUSH, hand.score());
    }

    @Test
    void testRoyalFlush() {
        Hand hand = new Hand();
        hand.addCard(Rank.TEN, Suit.HEARTS);
        hand.addCard(Rank.JACK, Suit.HEARTS);
        hand.addCard(Rank.QUEEN, Suit.HEARTS);
        hand.addCard(Rank.KING, Suit.HEARTS);
        hand.addCard(Rank.ACE, Suit.HEARTS);
        Assertions.assertEquals(Score.ROYAL_FLUSH, hand.score());
    }
}
