package com.mentoring.mentoringMeeting;

import java.util.Arrays;
import java.util.List;

public class RoyalFlushMatcher implements Matcher {
    public boolean isMatch(List<Card> cards) {
        List<Integer> expectedRanks = Arrays.asList(10, 11, 12, 13, 14);
        Hand hand = new Hand(cards);
        StraightFlushMatcher straightFlushMatcher = new StraightFlushMatcher();
        return straightFlushMatcher.isMatch(cards) && hand.getSortedValuesList().equals(expectedRanks);
    }

    public String result() {
        return "royalFlush";
    }
}
