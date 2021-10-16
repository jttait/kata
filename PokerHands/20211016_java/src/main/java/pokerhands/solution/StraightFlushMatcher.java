package pokerhands.solution;

public class StraightFlushMatcher implements Matcher {
    @Override
    public boolean isMatch(Hand hand) {
        StraightMatcher straightMatcher = new StraightMatcher();
        FlushMatcher flushMatcher = new FlushMatcher();
        return straightMatcher.isMatch(hand) && flushMatcher.isMatch(hand);
    }

    @Override
    public Score result() {
        return Score.STRAIGHT_FLUSH;
    }
}
