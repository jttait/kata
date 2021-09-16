package com.marsrover.solution;

public class LeftStrategy implements InstructionStrategy {
    public Pose execute(Pose pose) {
        return pose.anticlockwiseOne();
    }
}
