package com.coinchange.solution;

import java.util.*;
import java.util.stream.Collectors;

public class CoinChanger {
    private Map<Integer, Integer> availableCoins;

    public CoinChanger() {
        this.availableCoins = new HashMap<>();
    }

    public void addChange(int denomination, int number) {
        if (availableCoins.containsKey(denomination)) {
            availableCoins.put(denomination, availableCoins.get(denomination) + number);
        } else {
            availableCoins.put(denomination, number);
        }
    }

    public List<Integer> dispenseChange(int change) {
        List<Integer> coins = new ArrayList<>();
        List<Integer> denominations = availableCoins
                .keySet()
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for (int denomination : denominations) {
            while (change >= denomination && availableCoins.get(denomination) > 0) {
                coins.add(denomination);
                change -= denomination;
                availableCoins.put(denomination, availableCoins.get(denomination) - 1);
            }
        }
        return coins;
    }
}
