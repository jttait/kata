package com.mentoring.mentoringMeeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RoyalFlushMatcherTest {

    @Test
    void testRoyalFlushIsTrue() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "10"));
        hand.add(new Card(Suit.SPADE, "J"));
        hand.add(new Card(Suit.SPADE, "Q"));
        hand.add(new Card(Suit.SPADE, "K"));
        hand.add(new Card(Suit.SPADE, "A"));
        Assertions.assertTrue(new RoyalFlushMatcher().isMatch(hand));
    }

    @Test
    void testRoyalFlushIsFalse1() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "10"));
        hand.add(new Card(Suit.SPADE, "J"));
        hand.add(new Card(Suit.HEART, "Q"));
        hand.add(new Card(Suit.SPADE, "K"));
        hand.add(new Card(Suit.SPADE, "A"));
        Assertions.assertFalse(new RoyalFlushMatcher().isMatch(hand));
    }

    @Test
    void testRoyalFlushIsFalse2() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "9"));
        hand.add(new Card(Suit.SPADE, "10"));
        hand.add(new Card(Suit.SPADE, "J"));
        hand.add(new Card(Suit.SPADE, "Q"));
        hand.add(new Card(Suit.SPADE, "K"));
        Assertions.assertFalse(new RoyalFlushMatcher().isMatch(hand));
    }
}
