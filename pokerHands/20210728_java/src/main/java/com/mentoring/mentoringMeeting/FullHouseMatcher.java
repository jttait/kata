package com.mentoring.mentoringMeeting;

import java.util.List;
import java.util.Map;

public class FullHouseMatcher implements Matcher {
    public boolean isMatch(List<Card> cards) {
        Hand hand = new Hand(cards);
        Map<Integer, Integer> occurrences = hand.getValuesMap();
        return occurrences.containsValue(3) && occurrences.containsValue(2);
    }

    public String result() {
        return "fullHouse";
    }

}
