package marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PoseTest {

    Position initialPosition = new Position(0, 0);

    @Test
    void northForward() {
        Pose pose = new Pose(initialPosition, Heading.NORTH);
        Position expectedPosition = new Position(0, 1);
        Pose expectedPose = new Pose(expectedPosition, Heading.NORTH);
        Assertions.assertEquals(expectedPose, pose.forward());
    }

    @Test
    void eastForward() {
        Pose pose = new Pose(initialPosition, Heading.EAST);
        Position expectedPosition = new Position(1, 0);
        Pose expectedPose = new Pose(expectedPosition, Heading.EAST);
        Assertions.assertEquals(expectedPose, pose.forward());
    }

    @Test
    void southForward() {
        Pose pose = new Pose(initialPosition, Heading.SOUTH);
        Position expectedPosition = new Position(0, -1);
        Pose expectedPose = new Pose(expectedPosition, Heading.SOUTH);
        Assertions.assertEquals(expectedPose, pose.forward());
    }

    @Test
    void westForward() {
        Pose pose = new Pose(initialPosition, Heading.WEST);
        Position expectedPosition = new Position(-1, 0);
        Pose expectedPose = new Pose(expectedPosition, Heading.WEST);
        Assertions.assertEquals(expectedPose, pose.forward());
    }

    @Test
    void northReverse() {
        Pose pose = new Pose(initialPosition, Heading.NORTH);
        Position expectedPosition = new Position(0, -1);
        Pose expectedPose = new Pose(expectedPosition, Heading.NORTH);
        Assertions.assertEquals(expectedPose, pose.reverse());
    }

    @Test
    void eastReverse() {
        Pose pose = new Pose(initialPosition, Heading.EAST);
        Position expectedPosition = new Position(-1, 0);
        Pose expectedPose = new Pose(expectedPosition, Heading.EAST);
        Assertions.assertEquals(expectedPose, pose.reverse());
    }

    @Test
    void southReverse() {
        Pose pose = new Pose(initialPosition, Heading.SOUTH);
        Position expectedPosition = new Position(0, 1);
        Pose expectedPose = new Pose(expectedPosition, Heading.SOUTH);
        Assertions.assertEquals(expectedPose, pose.reverse());
    }

    @Test
    void westReverse() {
        Pose pose = new Pose(initialPosition, Heading.WEST);
        Position expectedPosition = new Position(1, 0);
        Pose expectedPose = new Pose(expectedPosition, Heading.WEST);
        Assertions.assertEquals(expectedPose, pose.reverse());
    }

    @Test
    void northClockwise() {
        Pose pose = new Pose(initialPosition, Heading.NORTH);
        Pose expectedPose = new Pose(initialPosition, Heading.EAST);
        Assertions.assertEquals(expectedPose, pose.clockwise());
    }

    @Test
    void eastClockwise() {
        Pose pose = new Pose(initialPosition, Heading.EAST);
        Pose expectedPose = new Pose(initialPosition, Heading.SOUTH);
        Assertions.assertEquals(expectedPose, pose.clockwise());
    }

    @Test
    void southClockwise() {
        Pose pose = new Pose(initialPosition, Heading.SOUTH);
        Pose expectedPose = new Pose(initialPosition, Heading.WEST);
        Assertions.assertEquals(expectedPose, pose.clockwise());
    }

    @Test
    void westClockwise() {
        Pose pose = new Pose(initialPosition, Heading.WEST);
        Pose expectedPose = new Pose(initialPosition, Heading.NORTH);
        Assertions.assertEquals(expectedPose, pose.clockwise());
    }

    @Test
    void northAnticlockwise() {
        Pose pose = new Pose(initialPosition, Heading.NORTH);
        Pose expectedPose = new Pose(initialPosition, Heading.WEST);
        Assertions.assertEquals(expectedPose, pose.anticlockwise());
    }

    @Test
    void eastAnticlockwise() {
        Pose pose = new Pose(initialPosition, Heading.EAST);
        Pose expectedPose = new Pose(initialPosition, Heading.NORTH);
        Assertions.assertEquals(expectedPose, pose.anticlockwise());
    }

    @Test
    void southAnticlockwise() {
        Pose pose = new Pose(initialPosition, Heading.SOUTH);
        Pose expectedPose = new Pose(initialPosition, Heading.EAST);
        Assertions.assertEquals(expectedPose, pose.anticlockwise());
    }

    @Test
    void westAnticlockwise() {
        Pose pose = new Pose(initialPosition, Heading.WEST);
        Pose expectedPose = new Pose(initialPosition, Heading.SOUTH);
        Assertions.assertEquals(expectedPose, pose.anticlockwise());
    }
}
