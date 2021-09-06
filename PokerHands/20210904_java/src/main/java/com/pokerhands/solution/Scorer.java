package com.pokerhands.solution;

import java.util.List;

public interface Scorer {
    boolean isMatch(List<Card> cards);
    Score result();
}
