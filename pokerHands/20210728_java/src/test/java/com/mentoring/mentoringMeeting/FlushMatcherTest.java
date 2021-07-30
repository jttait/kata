package com.mentoring.mentoringMeeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FlushMatcherTest {

    @Test
    void testFlushIsTrue() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.SPADE, "8"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "10"));
        Assertions.assertTrue(new FlushMatcher().isMatch(hand));
    }

    @Test
    void testFlushIsFalse() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.HEART, "8"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "10"));
        Assertions.assertFalse(new FlushMatcher().isMatch(hand));
    }
}
