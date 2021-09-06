package com.tenpinbowling.solution;

import java.util.Arrays;
import java.util.List;

public class Frame {

    private List<Integer> rolls;

    public Frame(int first) {
        this.rolls = Arrays.asList(first);
    }

    public Frame(int first, int second) {
        this.rolls = Arrays.asList(first, second);
    }

    public Frame(int first, int second, int third) {
        this.rolls = Arrays.asList(first, second, third);
    }

    public int sumOfRolls() {
        return rolls.stream().reduce(0, Integer::sum);
    }

    public boolean wasStrike() {
        return this.rolls.get(0) == 10;
    }

    public boolean wasSpare() {
        return sumOfRolls() == 10 && this.rolls.get(0) != 10;
    }

    public int getFirst() {
        return this.rolls.get(0);
    }

    public int getSecond() {
        return this.rolls.get(1);
    }
}
