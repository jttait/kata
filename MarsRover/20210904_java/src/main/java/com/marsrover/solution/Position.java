package com.marsrover.solution;

import java.util.Objects;

public class Position {

    private final int x;
    private final int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position oneNorth() {
        return new Position(this.x, this.y + 1);
    }

    public Position oneEast() {
        return new Position(this.x + 1, this.y);
    }

    public Position oneSouth() {
        return new Position(this.x, this.y - 1);
    }

    public Position oneWest() {
        return new Position(this.x - 1, this.y);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
