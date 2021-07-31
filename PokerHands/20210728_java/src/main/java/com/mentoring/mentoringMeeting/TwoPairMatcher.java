package com.mentoring.mentoringMeeting;

import java.util.List;

public class TwoPairMatcher implements Matcher {

    public boolean isMatch(List<Card> cards) {
        Hand hand = new Hand(cards);
        return hand.getValuesSet().size() == 3;
    }

    public String result() {
        return "twoPair";
    }
}
