package com.pokerhands.pokerhandskata;

public class RoyalFlushScorer implements Scorer {

    public boolean isMatch(Cards cards) {
        StraightFlushScorer straightFlushScorer = new StraightFlushScorer();

        return straightFlushScorer.isMatch(cards) && cards.getNumericalRanks().get(0) == 10;
    }

    public Score result() {
        return Score.ROYAL_FLUSH;
    }

}
