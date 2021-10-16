package pokerhands.solution;

import java.util.ArrayList;
import java.util.List;

public class HandScorer {
    public Score score(Hand hand) {
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
        return Score.HIGH_CARD;
    }
}
