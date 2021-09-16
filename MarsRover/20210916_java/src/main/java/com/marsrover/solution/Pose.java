package com.marsrover.solution;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

public class Pose {

    private Position position;
    private final Heading heading;

    public Pose(int x, int y, Heading heading) {
        this.position = new Position(x, y);
        this.heading = heading;
    }

    public Pose(Position position, Heading heading) {
        this.position = position;
        this.heading = heading;
    }

    public boolean isHeadingNorth() {
        return this.heading == Heading.NORTH;
    }

    public boolean isHeadingSouth() {
        return this.heading == Heading.SOUTH;
    }

    public boolean isHeadingEast() {
        return this.heading == Heading.EAST;
    }

    public boolean isHeadingWest() {
        return this.heading == Heading.WEST;
    }

    public Pose northOne() {
        return new Pose(this.position.northOne(), this.heading);
    }

    public Pose southOne() {
        return new Pose(this.position.southOne(), this.heading);
    }

    public Pose eastOne() {
        return new Pose(this.position.eastOne(), this.heading);
    }

    public Pose westOne() {
        return new Pose(this.position.westOne(), this.heading);
    }

    public Pose clockwiseOne() {
        Map<Heading, Heading> clockwise = new EnumMap<>(Heading.class);
        clockwise.put(Heading.NORTH, Heading.EAST);
        clockwise.put(Heading.EAST, Heading.SOUTH);
        clockwise.put(Heading.SOUTH, Heading.WEST);
        clockwise.put(Heading.WEST, Heading.NORTH);
        return new Pose(this.position, clockwise.get(this.heading));
    }

    public Pose anticlockwiseOne() {
        Map<Heading, Heading> anticlockwise = new EnumMap<>(Heading.class);
        anticlockwise.put(Heading.NORTH, Heading.WEST);
        anticlockwise.put(Heading.WEST, Heading.SOUTH);
        anticlockwise.put(Heading.SOUTH, Heading.EAST);
        anticlockwise.put(Heading.EAST, Heading.NORTH);
        return new Pose(this.position, anticlockwise.get(this.heading));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pose pose = (Pose) o;
        return Objects.equals(position, pose.position) &&
                heading == pose.heading;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, heading);
    }

    @Override
    public String toString() {
        return "Pose{" +
                "position=" + position +
                ", heading=" + heading +
                '}';
    }


}
