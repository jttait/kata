package pokerhands.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hand {

    private final List<Card> cards;

    Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Rank> getRanks() {
        return cards.stream().map(Card::getRank).collect(Collectors.toList());
    }

    public Map<Rank, Long> getRanksMap() {
        return cards.stream().collect(Collectors.groupingBy(Card::getRank, Collectors.counting()));
    }

    public Map<Suit, Long> getSuitsMap() {
        return cards.stream().collect(Collectors.groupingBy(Card::getSuit, Collectors.counting()));
    }
}
