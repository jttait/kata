package com.mentoring.mentoringMeeting;

import java.util.List;

public class OnePairMatcher implements Matcher {

    public boolean isMatch(List<Card> cards) {
        Hand hand = new Hand(cards);
        return hand.getValuesSet().size() == 4;
    }

    public String result() {
        return "onePair";
    }
}
