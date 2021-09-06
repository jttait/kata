package com.marsrover.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class RoverTests {

    @Test
    void initialisePositionAndHeading() {
        Position position = new Position(0, 0);
        Heading heading = Heading.NORTH;
        Pose pose = new Pose(position, heading);
        Rover rover = new Rover(pose);
    }

    @Test
    void forwardOneWhenFacingNorth() {
        Position position = new Position(0, 0);
        Heading heading = Heading.NORTH;
        Pose pose = new Pose(position, heading);
        Rover rover = new Rover(pose);
        List<Command> commands = new ArrayList<>();
        commands.add(Command.FORWARD);

        rover.execute(commands);

        Pose expected = new Pose(new Position(0, 1), Heading.NORTH);
        Assertions.assertEquals(expected, rover.getPose());
    }

    @Test
    void reverseOneWhenFacingNorth() {
        Position position = new Position(0, 0);
        Heading heading = Heading.NORTH;
        Pose pose = new Pose(position, heading);
        Rover rover = new Rover(pose);
        List<Command> commands = new ArrayList<>();
        commands.add(Command.REVERSE);

        rover.execute(commands);

        Pose expected = new Pose(new Position(0, -1), Heading.NORTH);
        Assertions.assertEquals(expected, rover.getPose());
    }

    @Test
    void forwardOneWhenFacingSouth() {
        Position position = new Position(0, 0);
        Heading heading = Heading.SOUTH;
        Pose pose = new Pose(position, heading);
        Rover rover = new Rover(pose);
        List<Command> commands = new ArrayList<>();
        commands.add(Command.FORWARD);

        rover.execute(commands);

        Pose expected = new Pose(new Position(0, -1), Heading.SOUTH);
        Assertions.assertEquals(expected, rover.getPose());
    }

    @Test
    void forwardRightReverse() {
        Position position = new Position(0, 0);
        Heading heading = Heading.NORTH;
        Pose pose = new Pose(position, heading);
        Rover rover = new Rover(pose);
        List<Command> commands = new ArrayList<>();
        commands.add(Command.FORWARD);
        commands.add(Command.RIGHT);
        commands.add(Command.REVERSE);

        rover.execute(commands);

        Pose expected = new Pose(new Position(-1, 1), Heading.EAST);
        Assertions.assertEquals(expected, rover.getPose());
    }

    @Test
    void forwardLeftForward() {
        Position position = new Position(0, 0);
        Heading heading = Heading.NORTH;
        Pose pose = new Pose(position, heading);
        Rover rover = new Rover(pose);
        List<Command> commands = new ArrayList<>();
        commands.add(Command.FORWARD);
        commands.add(Command.LEFT);
        commands.add(Command.FORWARD);

        rover.execute(commands);

        Pose expected = new Pose(new Position(-1, 1), Heading.WEST);
        Assertions.assertEquals(expected, rover.getPose());
    }

}
