package com.pokerhands.solution;

import java.util.List;

public interface Scorer {
    public boolean isMatch(List<Card> cards);
    public Score result();
}
