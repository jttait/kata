package com.pokerhands.solution;

public class Card {

    private final Rank rank;
    private final Suit suit;

    Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }
}
