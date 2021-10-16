package pokerhands.solution;

public class ThreeOfAKindMatcher implements Matcher {
    @Override
    public boolean isMatch(Hand hand) {
        return hand.getRanksMap().containsValue(3L);
    }

    @Override
    public Score result() {
        return Score.THREE_OF_A_KIND;
    }
}
