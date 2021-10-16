package pokerhands.solution;

public class FourOfAKindMatcher implements Matcher {
    @Override
    public boolean isMatch(Hand hand) {
        return hand.getRanksMap().containsValue(4L);
    }

    @Override
    public Score result() {
        return Score.FOUR_OF_A_KIND;
    }
}
