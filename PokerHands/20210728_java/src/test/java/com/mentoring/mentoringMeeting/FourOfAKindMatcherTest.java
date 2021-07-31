package com.mentoring.mentoringMeeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FourOfAKindMatcherTest {

    @Test
    void testFourOfAKindIsTrue() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "2"));
        hand.add(new Card(Suit.CLUB, "2"));
        hand.add(new Card(Suit.DIAMOND, "2"));
        hand.add(new Card(Suit.SPADE, "4"));
        Assertions.assertTrue(new FourOfAKindMatcher().isMatch(hand));
    }

    @Test
    void testFourOfAKindIsFalse() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "2"));
        hand.add(new Card(Suit.CLUB, "2"));
        hand.add(new Card(Suit.DIAMOND, "3"));
        hand.add(new Card(Suit.SPADE, "4"));
        Assertions.assertFalse(new FourOfAKindMatcher().isMatch(hand));
    }
}
