package com.pokerhands.pokerhandskata;

import java.util.*;
import java.util.stream.Collectors;

public class Cards {

    List<Card> cards;

    public Cards(Card... cardsArg) {
        this.cards = new ArrayList<>();
        this.cards.addAll(Arrays.asList(cardsArg));
    }

    public List<Integer> getNumericalRanks() {
        Map<Rank, Integer> ranksToIntegers = new HashMap<>();
        ranksToIntegers.put(Rank.TWO, 2);
        ranksToIntegers.put(Rank.THREE, 3);
        ranksToIntegers.put(Rank.FOUR, 4);
        ranksToIntegers.put(Rank.FIVE, 5);
        ranksToIntegers.put(Rank.SIX, 6);
        ranksToIntegers.put(Rank.SEVEN, 7);
        ranksToIntegers.put(Rank.EIGHT, 8);
        ranksToIntegers.put(Rank.NINE, 9);
        ranksToIntegers.put(Rank.TEN, 10);
        ranksToIntegers.put(Rank.JACK, 11);
        ranksToIntegers.put(Rank.QUEEN, 12);
        ranksToIntegers.put(Rank.KING, 13);
        ranksToIntegers.put(Rank.ACE, 14);
        return this.cards.stream().map(x -> ranksToIntegers.get(x.getRank())).sorted().collect(Collectors.toList());
    }

    public Map<Rank, Integer> getRankOccurrences() {
        Map<Rank, Integer> rankOccurrences = new HashMap<>();
        for (Card card : this.cards) {
            if (rankOccurrences.containsKey(card.getRank())) {
                int previousCount = rankOccurrences.get(card.getRank());
                rankOccurrences.put(card.getRank(), previousCount + 1);
            } else {
                rankOccurrences.put(card.getRank(), 1);
            }
        }
        return rankOccurrences;
    }

    public Map<Suit, Integer> getSuitOccurrences() {
        Map<Suit, Integer> suitOccurrences = new HashMap<>();
        for (Card card : this.cards) {
            if (suitOccurrences.containsKey(card.getSuit())) {
                int previousCount = suitOccurrences.get(card.getSuit());
                suitOccurrences.put(card.getSuit(), previousCount + 1);
            } else {
                suitOccurrences.put(card.getSuit(), 1);
            }
        }
        return suitOccurrences;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
