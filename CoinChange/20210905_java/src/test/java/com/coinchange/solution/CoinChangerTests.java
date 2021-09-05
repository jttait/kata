package com.coinchange.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CoinChangerTests {

    @Test
    void setAvailableDenominations() {
        CoinChanger changer = new CoinChanger();
        changer.addChange(100, 1);
    }

    @Test
    void changeOf100() {
        CoinChanger changer = new CoinChanger();
        changer.addChange(100, 1);
        List<Integer> changeCoins = List.of(100);
        Assertions.assertEquals(changeCoins, changer.dispenseChange(100));
    }

    @Test
    void changeOf50() {
        CoinChanger changer = new CoinChanger();
        changer.addChange(50, 1);
        List<Integer> changeCoins = List.of(50);
        Assertions.assertEquals(changeCoins, changer.dispenseChange(50));
    }

    @Test
    void changeOf50With25s() {
        CoinChanger changer = new CoinChanger();
        changer.addChange(25, 2);
        List<Integer> changeCoins = List.of(25, 25);
        Assertions.assertEquals(changeCoins, changer.dispenseChange(50));
    }

    @Test
    void changeOf130() {
        CoinChanger changer = new CoinChanger();
        changer.addChange(1, 6);
        changer.addChange(5, 5);
        changer.addChange(25, 10);
        changer.addChange(50, 1);
        List<Integer> changeCoins = List.of(50, 25, 25, 25, 5);
        Assertions.assertEquals(changeCoins, changer.dispenseChange(130));
    }
}
