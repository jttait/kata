package com.pokerhands.pokerhandskata;

public interface Scorer {

    boolean isMatch(Cards cards);
    Score result();

}
