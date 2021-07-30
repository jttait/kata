package com.mentoring.mentoringMeeting;

import java.util.List;

public class StraightFlushMatcher implements Matcher {
    public boolean isMatch(List<Card> cards) {
        StraightMatcher straightMatcher = new StraightMatcher();
        FlushMatcher flushMatcher = new FlushMatcher();
        return straightMatcher.isMatch(cards) && flushMatcher.isMatch(cards);
    }

    public String result() {
        return "straightFlush";
    }
}
