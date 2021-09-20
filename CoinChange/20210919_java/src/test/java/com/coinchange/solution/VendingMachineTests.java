package com.coinchange.solution;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import static com.coinchange.solution.Coin.*;

class VendingMachineTests {

    VendingMachine vendingMachine;

    @BeforeEach
    void setup() {
        vendingMachine = new VendingMachine();
    }

    @Test
    void shouldReturnPennyWhenMakingChangeOf1() {
        vendingMachine.add(PENNY);
        Assertions.assertEquals(List.of(PENNY), vendingMachine.makeChange(1));
    }

    @Test
    void shouldReturnTwoPenniesWhenMakingChangeOf2() {
        vendingMachine.add(List.of(PENNY, PENNY));
        Assertions.assertEquals(List.of(PENNY, PENNY), vendingMachine.makeChange(2));
    }

    @Test
    void shouldReturnNickelWhenMakingChangeOf5() {
        vendingMachine.add(NICKEL);
        Assertions.assertEquals(List.of(NICKEL), vendingMachine.makeChange(5));
    }

    @Test
    void shouldReturnDimeWhenMakingChangeOf10() {
        vendingMachine.add(DIME);
        Assertions.assertEquals(List.of(DIME), vendingMachine.makeChange(10));
    }

    @Test
    void shouldReturnQuarterWhenMakingChangeOf25() {
        vendingMachine.add(QUARTER);
        Assertions.assertEquals(List.of(QUARTER), vendingMachine.makeChange(25));
    }

    @Test
    void shouldReturnHalfWhenMakingChangeOf50() {
        vendingMachine.add(HALF);
        Assertions.assertEquals(List.of(HALF), vendingMachine.makeChange(50));
    }

    @Test
    void shouldReturnDollarWhenMakingChangeOf100() {
        vendingMachine.add(DOLLAR);
        Assertions.assertEquals(List.of(DOLLAR), vendingMachine.makeChange(100));
    }

    @Test
    void shouldReturnDollarAndQuarterWhenMakingChangeOf125() {
        vendingMachine.add(List.of(DOLLAR, QUARTER));
        Assertions.assertEquals(List.of(DOLLAR, QUARTER), vendingMachine.makeChange(125));
    }

    @Test
    void shouldReturnFivePenniesWhenNoDimesAvailable() {
        vendingMachine.add(List.of(PENNY, PENNY, PENNY, PENNY, PENNY));
        Assertions.assertEquals(List.of(PENNY, PENNY, PENNY, PENNY, PENNY), vendingMachine.makeChange(5));
    }

    @Test
    void shouldThrowWhenNotAbleToMakeChange() {
        Assertions.assertThrows(UnableToMakeChangeException.class, () -> vendingMachine.makeChange(1));
    }

    @Test
    void shouldThrowWhenChangeExhaustedByPreviousTransaction() {
        vendingMachine.add(NICKEL);
        vendingMachine.makeChange(5);
        Assertions.assertThrows(UnableToMakeChangeException.class, () -> vendingMachine.makeChange(5));
    }

    @Test
    void shouldThrowWhenNickelAndThreePenniesButChangeIs4() {
        vendingMachine.add(List.of(NICKEL, PENNY, PENNY, PENNY));
        Assertions.assertThrows(UnableToMakeChangeException.class, () -> vendingMachine.makeChange(4));
    }

    @Test
    void shouldReturnEmptyListWhenChangeIs0() {
        Assertions.assertEquals(List.of(), vendingMachine.makeChange(0));
    }

    @Test
    void shouldReturnNickelEvenWhenFivePenniesAreAvailable() {
        vendingMachine.add(List.of(NICKEL, PENNY, PENNY, PENNY, PENNY, PENNY));
        Assertions.assertEquals(List.of(NICKEL), vendingMachine.makeChange(5));
    }

    @Test
    void shouldReturnDimeEvenWhenTwoNickelsAreAvailable() {
        vendingMachine.add(List.of(NICKEL, NICKEL, DIME));
        Assertions.assertEquals(List.of(DIME), vendingMachine.makeChange(10));
    }

    @Test
    void shouldReturnDimeAndFivePenniesEvenWhenChangeIs10() {
        vendingMachine.add(List.of(NICKEL, PENNY, PENNY, PENNY, PENNY, PENNY));
        Assertions.assertEquals(List.of(NICKEL, PENNY, PENNY, PENNY, PENNY, PENNY), vendingMachine.makeChange(10));
    }
}
