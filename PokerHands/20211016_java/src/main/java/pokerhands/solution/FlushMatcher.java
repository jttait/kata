package pokerhands.solution;

public class FlushMatcher implements Matcher {
    @Override
    public boolean isMatch(Hand hand) {
        return hand.getSuitsMap().containsValue(5L);
    }

    @Override
    public Score result() {
        return Score.FLUSH;
    }
}
