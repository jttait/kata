package com.coinchange.solution;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private final List<Coin> coins;

    VendingMachine() {
        this.coins = new ArrayList<>();
    }
    
    public void add(Coin coin) {
        this.coins.add(coin);
    }

    public void add(List<Coin> coins) {
        this.coins.addAll(coins);
    }

    public List<Coin> makeChange(int change) throws UnableToMakeChangeException {
        List<Coin> result = new ArrayList<>();
        for (Coin coin : Coin.values()) {
            int numCoins = calculateNumberOfCoins(change, coin);
            updateCoins(numCoins, coin);
            change = updateChange(change, numCoins, coin);
            result = updateResult(numCoins, coin, result);
        }
        throwIfChangeNotMade(change);
        return result;
    }

    private void throwIfChangeNotMade(int change) throws UnableToMakeChangeException {
        if (change != 0) {
            throw new UnableToMakeChangeException("Unable to make change!");
        }
    }

    private int calculateNumberOfCoins(int change, Coin coin) {
        int availableCoins = (int) this.coins.stream().filter(c -> c == coin).count();
        return Math.min(availableCoins, change / coin.getValue());
    }

    private List<Coin> updateResult(int numCoins, Coin coin, List<Coin> result) {
        List<Coin> updatedResult = new ArrayList<>(result);
        for (int i = 0; i < numCoins; i++) {
            updatedResult.add(coin);
        }
        return updatedResult;
    }

    private int updateChange(int change, int numCoins, Coin coin) {
        return change - numCoins * coin.getValue();
    }

    private void updateCoins(int numCoins, Coin coin) {
        for (int i = 0; i < numCoins; i++) {
            this.coins.remove(coin);
        }
    }
}
