package pokerhands.solution;

import java.util.List;
import java.util.stream.Collectors;

public class StraightMatcher implements Matcher {
    @Override
    public boolean isMatch(Hand hand) {
        List<Integer> values = hand.getRanks().stream()
                .map(Rank::getValue)
                .sorted().collect(Collectors.toList());
        for (int i = 0; i < values.size() - 1; i++) {
            if (values.get(i) + 1 != values.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Score result() {
        return Score.STRAIGHT;
    }
}
