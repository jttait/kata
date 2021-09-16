package com.marsrover.solution;

public class RightStrategy implements InstructionStrategy {
    public Pose execute(Pose pose) {
        return pose.clockwiseOne();
    }
}
