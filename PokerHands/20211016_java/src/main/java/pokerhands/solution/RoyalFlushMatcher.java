package pokerhands.solution;

public class RoyalFlushMatcher implements Matcher {
    @Override
    public boolean isMatch(Hand hand) {
        StraightFlushMatcher straightFlushMatcher = new StraightFlushMatcher();
        return straightFlushMatcher.isMatch(hand) && hand.getRanks().contains(Rank.ACE);
    }

    @Override
    public Score result() {
        return Score.ROYAL_FLUSH;
    }
}
