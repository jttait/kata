package com.mentoring.mentoringMeeting;

import java.util.List;
import java.util.Map;

public class FlushMatcher implements Matcher {
    public boolean isMatch(List<Card> cards) {
        Hand hand = new Hand(cards);
        Map<Suit, Integer> suitOccurrences = hand.getSuitsMap();
        for (Suit suit : Suit.values()) {
            if (suitOccurrences.get(suit) == 5) {
                return true;
            }
        }
        return false;
    }

    public String result() {
        return "flush";
    }
}
