package pokerhands.solution;

public class OnePairMatcher implements Matcher {
    @Override
    public boolean isMatch(Hand hand) {
        return hand.getRanksMap().containsValue(2L);
    }

    @Override
    public Score result() {
        return Score.ONE_PAIR;
    }
}
