package pokerhands.solution;

public interface Matcher {
    boolean isMatch(Hand hand);
    Score result();
}
