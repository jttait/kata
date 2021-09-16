package com.marsrover.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PositionTests {

    @Test
    void shouldIncreaseYby1WhenNorthOne() {
        Position position = new Position(0, 0);
        position = position.northOne();
        Assertions.assertEquals(new Position(0, 1), position);
    }

    @Test
    void shouldDecreaseYby1WhenSouthOne() {
        Position position = new Position(0, 0);
        position = position.southOne();
        Assertions.assertEquals(new Position(0, -1), position);
    }

    @Test
    void shouldIncreaseXby1WhenEastOne() {
        Position position = new Position(0, 0);
        position = position.eastOne();
        Assertions.assertEquals(new Position(1, 0), position);
    }

    @Test
    void shouldDecreaseXby1WhenWestOne() {
        Position position = new Position(0, 0);
        position = position.westOne();
        Assertions.assertEquals(new Position(-1, 0), position);
    }

}
