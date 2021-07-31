package com.mentoring.mentoringMeeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class OnePairMatcherTest {

    @Test
    void testOnePairIsTrue() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "6"));
        Assertions.assertTrue(new OnePairMatcher().isMatch(hand));
    }

    @Test
    void testOnePairIsFalse() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "6"));
        Assertions.assertFalse(new OnePairMatcher().isMatch(hand));
    }

    @Test
    void testOnePairIsFalseWhenThreeOfAKind() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "6"));
        Assertions.assertFalse(new OnePairMatcher().isMatch(hand));
    }

    @Test
    void testOnePairIsFalseWhenFullHouse() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "2"));
        hand.add(new Card(Suit.CLUB, "2"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.HEART, "5"));
        Assertions.assertFalse(new OnePairMatcher().isMatch(hand));
    }
}
