package com.mentoring.mentoringMeeting;

import java.util.List;

public class StraightMatcher implements Matcher {
    public boolean isMatch(List<Card> cards) {
        Hand hand = new Hand(cards);
        List<Integer> integerList = hand.getSortedValuesList();
        for (int i = 0; i < integerList.size() - 1; i++) {
            if (integerList.get(i) + 1 != integerList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public String result() {
        return "straight";
    }
}
