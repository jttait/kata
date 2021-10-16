package pokerhands.solution;

import java.util.HashSet;

public class TwoPairMatcher implements Matcher {
    @Override
    public boolean isMatch(Hand hand) {
        return hand.getRanksMap().containsValue(2L) && (new HashSet<>(hand.getRanks()).size() == 3);
    }

    @Override
    public Score result() {
        return Score.TWO_PAIR;
    }
}
