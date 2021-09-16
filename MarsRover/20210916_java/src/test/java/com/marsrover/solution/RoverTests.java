package com.marsrover.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoverTests {

    @Test
    void shouldMoveNorthOneWhenHeadingNorthAndMovesForward() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.FORWARD);

        Assertions.assertEquals(new Pose(0, 1, Heading.NORTH), rover.getPose());
    }

    @Test
    void shouldMoveSouthOneWhenHeadingSouthAndMovesForward() {
        Pose pose = new Pose(0, 0, Heading.SOUTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.FORWARD);

        Assertions.assertEquals(new Pose(0, -1, Heading.SOUTH), rover.getPose());
    }

    @Test
    void shouldMoveEastOneWhenHeadingEastAndMovesForward() {
        Pose pose = new Pose(0, 0, Heading.EAST);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.FORWARD);

        Assertions.assertEquals(new Pose(1, 0, Heading.EAST), rover.getPose());
    }

    @Test
    void shouldMoveWestOneWhenHeadingWestAndMovesForward() {
        Pose pose = new Pose(0, 0, Heading.WEST);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.FORWARD);

        Assertions.assertEquals(new Pose(-1, 0, Heading.WEST), rover.getPose());
    }

    @Test
    void shouldMoveSouthOneWhenHeadingNorthAndMovesReverse() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.REVERSE);

        Assertions.assertEquals(new Pose(0, -1, Heading.NORTH), rover.getPose());
    }

    @Test
    void shouldMoveNorthOneWhenHeadingSouthAndMovesReverse() {
        Pose pose = new Pose(0, 0, Heading.SOUTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.REVERSE);

        Assertions.assertEquals(new Pose(0, 1, Heading.SOUTH), rover.getPose());
    }

    @Test
    void shouldMoveWestOneWhenHeadingEastAndMovesReverse() {
        Pose pose = new Pose(0, 0, Heading.EAST);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.REVERSE);

        Assertions.assertEquals(new Pose(-1, 0, Heading.EAST), rover.getPose());
    }

    @Test
    void shouldMoveEastOneWhenHeadingWestAndMovesReverse() {
        Pose pose = new Pose(0, 0, Heading.WEST);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.REVERSE);

        Assertions.assertEquals(new Pose(1, 0, Heading.WEST), rover.getPose());
    }

    @Test
    void shouldFaceEastWhenHeadingNorthAndTurnsRight() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.RIGHT);

        Assertions.assertEquals(new Pose(0, 0, Heading.EAST), rover.getPose());
    }

    @Test
    void shouldFaceSouthWhenHeadingEastAndTurnsRight() {
        Pose pose = new Pose(0, 0, Heading.EAST);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.RIGHT);

        Assertions.assertEquals(new Pose(0, 0, Heading.SOUTH), rover.getPose());
    }

    @Test
    void shouldFaceWestWhenHeadingSouthAndTurnsRight() {
        Pose pose = new Pose(0, 0, Heading.SOUTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.RIGHT);

        Assertions.assertEquals(new Pose(0, 0, Heading.WEST), rover.getPose());
    }

    @Test
    void shouldFaceNorthWhenHeadingWestAndTurnsRight() {
        Pose pose = new Pose(0, 0, Heading.WEST);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.RIGHT);

        Assertions.assertEquals(new Pose(0, 0, Heading.NORTH), rover.getPose());
    }

    @Test
    void shouldFaceWestWhenHeadingNorthAndTurnsLeft() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.LEFT);

        Assertions.assertEquals(new Pose(0, 0, Heading.WEST), rover.getPose());
    }

    @Test
    void shouldFaceSouthWhenHeadingWestAndTurnsLeft() {
        Pose pose = new Pose(0, 0, Heading.WEST);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.LEFT);

        Assertions.assertEquals(new Pose(0, 0, Heading.SOUTH), rover.getPose());
    }

    @Test
    void shouldFaceEastWhenHeadingSouthAndTurnsLeft() {
        Pose pose = new Pose(0, 0, Heading.SOUTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.LEFT);

        Assertions.assertEquals(new Pose(0, 0, Heading.EAST), rover.getPose());
    }

    @Test
    void shouldFaceNorthWhenHeadingEastAndTurnsLeft() {
        Pose pose = new Pose(0, 0, Heading.EAST);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.LEFT);

        Assertions.assertEquals(new Pose(0, 0, Heading.NORTH), rover.getPose());
    }

    @Test
    void shouldStayOnSameHeadingAfterLeftRightLeftRight() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.LEFT);
        rover.execute(Instruction.RIGHT);
        rover.execute(Instruction.LEFT);
        rover.execute(Instruction.RIGHT);

        Assertions.assertEquals(new Pose(0, 0, Heading.NORTH), rover.getPose());
    }

    @Test
    void shouldStayInSamePositionAfterForwardReverseForwardReverse() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.FORWARD);
        rover.execute(Instruction.REVERSE);
        rover.execute(Instruction.FORWARD);
        rover.execute(Instruction.REVERSE);

        Assertions.assertEquals(new Pose(0, 0, Heading.NORTH), rover.getPose());
    }

    @Test
    void shouldStayInSamePositionAfterDrivingAroundInCircle() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.FORWARD);
        rover.execute(Instruction.RIGHT);
        rover.execute(Instruction.FORWARD);
        rover.execute(Instruction.RIGHT);
        rover.execute(Instruction.FORWARD);
        rover.execute(Instruction.RIGHT);
        rover.execute(Instruction.FORWARD);
        rover.execute(Instruction.RIGHT);

        Assertions.assertEquals(new Pose(0, 0, Heading.NORTH), rover.getPose());
    }

    @Test
    void shouldBeNorthEastAfterForwardRightForward() {
        Pose pose = new Pose(0, 0, Heading.NORTH);
        Rover rover = new Rover(pose);

        rover.execute(Instruction.FORWARD);
        rover.execute(Instruction.RIGHT);
        rover.execute(Instruction.FORWARD);

        Assertions.assertEquals(new Pose(1, 1, Heading.EAST), rover.getPose());
    }


}
