package com.mentoring.mentoringMeeting;

import java.util.List;

public class ThreeOfAKindMatcher implements Matcher {

    public boolean isMatch(List<Card> cards) {
        Hand hand = new Hand(cards);
        return hand.getValuesMap().containsValue(3);
    }

    public String result() {
        return "threeOfAKind";
    }

}
