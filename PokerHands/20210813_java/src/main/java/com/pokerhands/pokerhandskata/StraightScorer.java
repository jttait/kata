package com.pokerhands.pokerhandskata;

import java.util.List;

public class StraightScorer implements Scorer {

    public boolean isMatch(Cards cards) {
        List<Integer> numericalRanks = cards.getNumericalRanks();
        int previousValue = numericalRanks.get(0);
        for (int i = 1; i < numericalRanks.size(); i++) {
            if (numericalRanks.get(i) != previousValue + 1) {
                return false;
            }
            previousValue = numericalRanks.get(i);
        }
        return true;
    }

    public Score result() {
        return Score.STRAIGHT;
    }

}
