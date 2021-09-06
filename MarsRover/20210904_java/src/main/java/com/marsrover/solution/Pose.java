package com.marsrover.solution;

import java.util.Objects;

public class Pose {

    private final Position position;
    private final Heading heading;

    Pose(Position position, Heading heading) {
        this.position = position;
        this.heading = heading;
    }

    public boolean isFacingNorth() {
        return this.heading == Heading.NORTH;
    }

    public boolean isFacingEast() {
        return this.heading == Heading.EAST;
    }

    public boolean isFacingSouth() {
        return this.heading == Heading.SOUTH;
    }

    public boolean isFacingWest() {
        return this.heading == Heading.WEST;
    }

    public Pose translateNorth() {
        return new Pose(this.position.oneNorth(), this.heading);
    }

    public Pose translateEast() {
        return new Pose(this.position.oneEast(), this.heading);
    }

    public Pose translateSouth() {
        return new Pose(this.position.oneSouth(), this.heading);
    }

    public Pose translateWest() {
        return new Pose(this.position.oneWest(), this.heading);
    }

    public Pose rotateClockwise() {
        if (isFacingNorth()) {
            return new Pose(this.position, Heading.EAST);
        } else if (isFacingEast()) {
            return new Pose(this.position, Heading.SOUTH);
        } else if (isFacingSouth()) {
            return new Pose(this.position, Heading.WEST);
        }
        return new Pose(this.position, Heading.NORTH);
    }

    public Pose rotateAntiClockwise() {
        if (isFacingNorth()) {
            return new Pose(this.position, Heading.WEST);
        } else if (isFacingEast()) {
            return new Pose(this.position, Heading.NORTH);
        } else if (isFacingSouth()) {
            return new Pose(this.position, Heading.EAST);
        }
        return new Pose(this.position, Heading.SOUTH);
    }

    @Override
    public String toString() {
        return "Pose{" +
                "position=" + position +
                ", heading=" + heading +
                '}';
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
}
