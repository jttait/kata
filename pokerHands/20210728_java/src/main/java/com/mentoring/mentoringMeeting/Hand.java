package com.mentoring.mentoringMeeting;

import java.util.*;
import java.util.stream.Collectors;

public class Hand {

    List<Card> cards;

    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    public Map<Integer, Integer> getValuesMap() {
        List<Integer> integerList = cards.stream().map(card -> card.rank).collect(Collectors.toList());
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int card : integerList) {
            if (occurrences.containsKey(card)) {
                int oldValue = occurrences.get(card);
                oldValue++;
                occurrences.put(card, oldValue);
            } else {
                occurrences.put(card, 1);
            }
        }
        return occurrences;
    }

    public Map<Suit, Integer> getSuitsMap() {
        Map<Suit, Integer> suitOccurrences = new HashMap<>();
        for (Suit suit : Suit.values()) {
            suitOccurrences.put(suit, 0);
        }
        for (Card card : cards) {
            suitOccurrences.put(card.suit, suitOccurrences.get(card.suit) + 1);
        }
        return suitOccurrences;
    }

    public Set<Integer> getValuesSet() {
        List<Integer> integerList = cards.stream().map(card -> card.rank).collect(Collectors.toList());
        Set<Integer> setHand = new HashSet(integerList);
        return setHand;
    }

    public List<Integer> getSortedValuesList() {
        return cards.stream()
                .map(card -> card.rank)
                .sorted()
                .collect(Collectors.toList());
    }

}
