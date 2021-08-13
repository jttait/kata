package com.pokerhands.pokerhandskata;

public class FullHouseScorer implements Scorer {

    public boolean isMatch(Cards cards) {
        return cards.getRankOccurrences().values().stream().filter(x -> x == 3).count() == 1 &&
                cards.getRankOccurrences().values().stream().filter(x -> x == 2).count() == 1;
    }

    public Score result() {
        return Score.FULL_HOUSE;
    }

}
