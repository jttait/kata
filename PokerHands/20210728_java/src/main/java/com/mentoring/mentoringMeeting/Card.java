package com.mentoring.mentoringMeeting;

import java.util.HashMap;
import java.util.Map;

public class Card {

    Suit suit;
    int rank;

    public Card(Suit suit, String value) {
        this.suit = suit;

        Map<String, Integer> rankInteger = new HashMap<>();
        rankInteger.put("2", 2);
        rankInteger.put("3", 3);
        rankInteger.put("4", 4);
        rankInteger.put("5", 5);
        rankInteger.put("6", 6);
        rankInteger.put("7", 7);
        rankInteger.put("8", 8);
        rankInteger.put("9", 9);
        rankInteger.put("10", 10);
        rankInteger.put("J", 11);
        rankInteger.put("Q", 12);
        rankInteger.put("K", 13);
        rankInteger.put("A", 14);

        this.rank = rankInteger.get(value);
    }
}
