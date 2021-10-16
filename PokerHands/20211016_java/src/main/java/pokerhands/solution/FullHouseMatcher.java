package pokerhands.solution;

public class FullHouseMatcher implements Matcher {
    @Override
    public boolean isMatch(Hand hand) {
        return hand.getRanksMap().containsValue(2L) && hand.getRanksMap().containsValue(3L);
    }

    @Override
    public Score result() {
        return Score.FULL_HOUSE;
    }
}
