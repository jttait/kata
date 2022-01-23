package marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    void up() {
        Position position = new Position(0, 0);
        Assertions.assertEquals(new Position(0, 1), position.northOne());
    }

    @Test
    void right() {
        Position position = new Position(0, 0);
        Assertions.assertEquals(new Position(1, 0), position.eastOne());
    }

    @Test
    void down() {
        Position position = new Position(0, 0);
        Assertions.assertEquals(new Position(0, -1), position.southOne());
    }

    @Test
    void left() {
        Position position = new Position(0, 0);
        Assertions.assertEquals(new Position(-1, 0), position.westOne());
    }

    @Test
    void upDownLeftRight() {
        Position position = new Position(0, 0);
        Assertions.assertEquals(new Position(0, 0), position.northOne().southOne().westOne().eastOne());
    }

}
