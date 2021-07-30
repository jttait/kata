package com.mentoring.mentoringMeeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ThreeOfAKindMatcherTest {

    @Test
    void testThreeOfAKindIsTrue() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "4"));
        Assertions.assertTrue(new ThreeOfAKindMatcher().isMatch(hand));
    }

    @Test
    void testThreeOfAKindIsFalse() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.SPADE, "4"));
        hand.add(new Card(Suit.SPADE, "5"));
        hand.add(new Card(Suit.SPADE, "4"));
        Assertions.assertFalse(new ThreeOfAKindMatcher().isMatch(hand));
    }
}
