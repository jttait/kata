package com.mentoring.mentoringMeeting;

import java.util.*;

public class PokerScorer {

    public String scoreHand(List<Card> hand) {
        List<Matcher> matchers = new ArrayList<>();
        matchers.add(new RoyalFlushMatcher());
        matchers.add(new StraightFlushMatcher());
        matchers.add(new FourOfAKindMatcher());
        matchers.add(new FullHouseMatcher());
        matchers.add(new FlushMatcher());
        matchers.add(new StraightMatcher());
        matchers.add(new ThreeOfAKindMatcher());
        matchers.add(new TwoPairMatcher());
        matchers.add(new OnePairMatcher());

        for (Matcher matcher : matchers) {
            if (matcher.isMatch(hand)) {
                return matcher.result();
            }
        }
        return "highCard";
    }
}
