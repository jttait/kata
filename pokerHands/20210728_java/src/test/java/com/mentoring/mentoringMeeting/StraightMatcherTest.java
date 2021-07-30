package com.mentoring.mentoringMeeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StraightMatcherTest {

    @Test
    void testStraightIsTrue() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "6"));
        Assertions.assertTrue(new StraightMatcher().isMatch(hand));
    }

    @Test
    void testStraightIsFalse() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "7"));
        Assertions.assertFalse(new StraightMatcher().isMatch(hand));
    }

}
