package com.marsrover.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PoseTests {

    @Test
    void shouldIncreaseYby1WhenMovingNorth() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        pose = pose.northOne();
        Assertions.assertEquals(new Pose(0, 1, Heading.NORTH), pose);
    }

    @Test
    void shouldDecreaseYby1WhenMovingSouth() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        pose = pose.southOne();
        Assertions.assertEquals(new Pose(0, -1, Heading.NORTH), pose);
    }

    @Test
    void shouldIncreaseXby1WhenMovingEast() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        pose = pose.eastOne();
        Assertions.assertEquals(new Pose(1, 0, Heading.NORTH), pose);
    }

    @Test
    void shouldDecreaseXby1WhenMovingWest() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        pose = pose.westOne();
        Assertions.assertEquals(new Pose(-1, 0, Heading.NORTH), pose);
    }

    @Test
    void shouldFaceEastWhenFacingNorthAndClockwise() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        pose = pose.clockwiseOne();
        Assertions.assertEquals(new Pose(0, 0, Heading.EAST), pose);
    }

    @Test
    void shouldFaceSouthWhenFacingEastAndClockwise() {
        Pose pose = new Pose(0, 0, Heading.EAST);
        pose = pose.clockwiseOne();
        Assertions.assertEquals(new Pose(0, 0, Heading.SOUTH), pose);
    }

    @Test
    void shouldFaceWestWhenFacingSouthAndClockwise() {
        Pose pose = new Pose(0, 0, Heading.SOUTH);
        pose = pose.clockwiseOne();
        Assertions.assertEquals(new Pose(0, 0, Heading.WEST), pose);
    }

    @Test
    void shouldFaceNorthWhenFacingWestAndClockwise() {
        Pose pose = new Pose(0, 0, Heading.WEST);
        pose = pose.clockwiseOne();
        Assertions.assertEquals(new Pose(0, 0, Heading.NORTH), pose);
    }

    @Test
    void shouldFaceWestWhenFacingNorthAndAntilockwise() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        pose = pose.anticlockwiseOne();
        Assertions.assertEquals(new Pose(0, 0, Heading.WEST), pose);
    }

    @Test
    void shouldFaceSouthWhenFacingWestAndAntilockwise() {
        Pose pose = new Pose(0, 0, Heading.WEST);
        pose = pose.anticlockwiseOne();
        Assertions.assertEquals(new Pose(0, 0, Heading.SOUTH), pose);
    }

    @Test
    void shouldFaceEastWhenFacingSouthAndAntilockwise() {
        Pose pose = new Pose(0, 0, Heading.SOUTH);
        pose = pose.anticlockwiseOne();
        Assertions.assertEquals(new Pose(0, 0, Heading.EAST), pose);
    }

    @Test
    void shouldFaceNorthWhenFacingEastAndAntilockwise() {
        Pose pose = new Pose(0, 0, Heading.EAST);
        pose = pose.anticlockwiseOne();
        Assertions.assertEquals(new Pose(0, 0, Heading.NORTH), pose);
    }
}
