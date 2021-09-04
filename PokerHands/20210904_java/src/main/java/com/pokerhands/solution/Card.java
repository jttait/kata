package com.pokerhands.solution;

public class Card {

    private final Suit suit;
    private final Rank rank;

    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() { return this.suit; }
}
