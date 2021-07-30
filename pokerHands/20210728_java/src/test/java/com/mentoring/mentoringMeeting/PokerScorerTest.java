package com.mentoring.mentoringMeeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PokerScorerTest {
    @Test
    void testHighCard() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "4"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "6"));
        hand.add(new Card(Suit.SPADE, "7"));
        Assertions.assertEquals("highCard", new PokerScorer().scoreHand(hand));
    }

    @Test
    void testOnePair() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "4"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "6"));
        hand.add(new Card(Suit.SPADE, "6"));
        Assertions.assertEquals("onePair", new PokerScorer().scoreHand(hand));
    }

    @Test
    void testTwoPair() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "4"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "6"));
        hand.add(new Card(Suit.SPADE, "6"));
        Assertions.assertEquals("twoPair", new PokerScorer().scoreHand(hand));
    }

    @Test
    void testThreeOfAKind() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "4"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "6"));
        Assertions.assertEquals("threeOfAKind", new PokerScorer().scoreHand(hand));
    }

    @Test
    void testStraight() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "3"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "6"));
        Assertions.assertEquals("straight", new PokerScorer().scoreHand(hand));
    }

    @Test
    void testFlush() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.SPADE, "10"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "8"));
        Assertions.assertEquals("flush", new PokerScorer().scoreHand(hand));
    }

    @Test
    void testFullHouse() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "2"));
        hand.add(new Card(Suit.CLUB, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.HEART, "3"));
        Assertions.assertEquals("fullHouse", new PokerScorer().scoreHand(hand));
    }

    @Test
    void testFourOfAKind() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "2"));
        hand.add(new Card(Suit.CLUB, "2"));
        hand.add(new Card(Suit.DIAMOND, "2"));
        hand.add(new Card(Suit.HEART, "3"));
        Assertions.assertEquals("fourOfAKind", new PokerScorer().scoreHand(hand));
    }

    @Test
    void testStraightFlush() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "6"));
        Assertions.assertEquals("straightFlush", new PokerScorer().scoreHand(hand));
    }

    @Test
    void testRoyalFlush() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "10"));
        hand.add(new Card(Suit.SPADE, "J"));
        hand.add(new Card(Suit.SPADE, "Q"));
        hand.add(new Card(Suit.SPADE, "K"));
        hand.add(new Card(Suit.SPADE, "A"));
        Assertions.assertEquals("royalFlush", new PokerScorer().scoreHand(hand));
    }
}
