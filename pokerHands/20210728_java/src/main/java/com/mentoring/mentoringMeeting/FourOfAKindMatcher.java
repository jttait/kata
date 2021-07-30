package com.mentoring.mentoringMeeting;

import java.util.List;

public class FourOfAKindMatcher implements Matcher {
    public boolean isMatch(List<Card> cards) {
        Hand hand = new Hand(cards);
        return hand.getValuesMap().containsValue(4);
    }

    public String result() {
        return "fourOfAKind";
    }
}
