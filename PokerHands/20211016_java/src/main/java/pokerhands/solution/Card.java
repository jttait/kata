package pokerhands.solution;

public class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card(String rank, String suit) {
        this.rank = Rank.valueOf(rank);
        this.suit = Suit.valueOf(suit);
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() { return this.suit; }
}
