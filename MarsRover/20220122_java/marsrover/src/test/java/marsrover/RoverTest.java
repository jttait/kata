package marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoverTest {

    @Test
    void forward() {
        Position position = new Position(0, 0);
        Pose pose = new Pose(position, Heading.NORTH);
        Instructions instructions = new Instructions();
        instructions.add(Instruction.FORWARD);
        Rover rover = new Rover(pose, instructions);
        Position expectedPosition = new Position(0, 1);
        Pose expectedPose = new Pose(expectedPosition, Heading.NORTH);
        Instructions expectedInstructions = new Instructions();
        Rover expectedRover = new Rover(expectedPose, expectedInstructions);
        Assertions.assertEquals(expectedRover, rover.executeAllInstructions());
    }

    @Test
    void reverse() {
        Position position = new Position(0, 0);
        Pose pose = new Pose(position, Heading.NORTH);
        Instructions instructions = new Instructions();
        instructions.add(Instruction.REVERSE);
        Rover rover = new Rover(pose, instructions);
        Position expectedPosition = new Position(0, -1);
        Pose expectedPose = new Pose(expectedPosition, Heading.NORTH);
        Instructions expectedInstructions = new Instructions();
        Rover expectedRover = new Rover(expectedPose, expectedInstructions);
        Assertions.assertEquals(expectedRover, rover.executeNextInstruction());
    }

    @Test
    void clockwise() {
        Position position = new Position(0, 0);
        Pose pose = new Pose(position, Heading.NORTH);
        Instructions instructions = new Instructions();
        instructions.add(Instruction.CLOCKWISE);
        Rover rover = new Rover(pose, instructions);
        Position expectedPosition = new Position(0, 0);
        Pose expectedPose = new Pose(expectedPosition, Heading.EAST);
        Instructions expectedInstructions = new Instructions();
        Rover expectedRover = new Rover(expectedPose, expectedInstructions);
        Assertions.assertEquals(expectedRover, rover.executeNextInstruction());
    }

    @Test
    void anticlockwise() {
        Position position = new Position(0, 0);
        Pose pose = new Pose(position, Heading.NORTH);
        Instructions instructions = new Instructions();
        instructions.add(Instruction.ANTICLOCKWISE);
        Rover rover = new Rover(pose, instructions);
        Position expectedPosition = new Position(0, 0);
        Pose expectedPose = new Pose(expectedPosition, Heading.WEST);
        Instructions expectedInstructions = new Instructions();
        Rover expectedRover = new Rover(expectedPose, expectedInstructions);
        Assertions.assertEquals(expectedRover, rover.executeNextInstruction());
    }

    @Test
    void forwardForward() {
        Position position = new Position(0, 0);
        Pose pose = new Pose(position, Heading.NORTH);
        Instructions instructions = new Instructions();
        instructions.add(Instruction.FORWARD);
        instructions.add(Instruction.FORWARD);
        Rover rover = new Rover(pose, instructions);
        Position expectedPosition = new Position(0, 2);
        Pose expectedPose = new Pose(expectedPosition, Heading.NORTH);
        Instructions expectedInstructions = new Instructions();
        Rover expectedRover = new Rover(expectedPose, expectedInstructions);
        Assertions.assertEquals(expectedRover, rover.executeAllInstructions());
    }

    @Test
    void forwardClockwiseReverseAnticlockwise() {
        Position position = new Position(0, 0);
        Pose pose = new Pose(position, Heading.NORTH);
        Instructions instructions = new Instructions();
        instructions.add(Instruction.FORWARD);
        instructions.add(Instruction.CLOCKWISE);
        instructions.add(Instruction.REVERSE);
        instructions.add(Instruction.ANTICLOCKWISE);
        Rover rover = new Rover(pose, instructions);
        Position expectedPosition = new Position(1, 1);
        Pose expectedPose = new Pose(expectedPosition, Heading.NORTH);
        Instructions expectedInstructions = new Instructions();
        Rover expectedRover = new Rover(expectedPose, expectedInstructions);
        Assertions.assertEquals(expectedRover, rover.executeAllInstructions());
    }
}
