package com.mentoring.mentoringMeeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StraightFlushMatcherTest {

    @Test
    void testStraightFlushIsTrue() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "6"));
        Assertions.assertTrue(new StraightFlushMatcher().isMatch(hand));
    }

    @Test
    void testStraightFlushIsFalse() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.HEART, "6"));
        Assertions.assertFalse(new StraightFlushMatcher().isMatch(hand));
    }
}
