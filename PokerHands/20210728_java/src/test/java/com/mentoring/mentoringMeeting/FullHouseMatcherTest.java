package com.mentoring.mentoringMeeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FullHouseMatcherTest {

    @Test
    void testFullHouseIsTrue() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.HEART, "3"));
        hand.add(new Card(Suit.CLUB, "3"));
        Assertions.assertTrue(new FullHouseMatcher().isMatch(hand));
    }

    @Test
    void testFullHouseIsFalse() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(Suit.SPADE, "2"));
        hand.add(new Card(Suit.HEART, "2"));
        hand.add(new Card(Suit.SPADE, "3"));
        hand.add(new Card(Suit.HEART, "3"));
        hand.add(new Card(Suit.CLUB, "4"));
        Assertions.assertFalse(new FullHouseMatcher().isMatch(hand));
    }
}
