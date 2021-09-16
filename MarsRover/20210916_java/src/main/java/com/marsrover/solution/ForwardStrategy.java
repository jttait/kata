package com.marsrover.solution;

public class ForwardStrategy implements InstructionStrategy {
    public Pose execute(Pose pose) {
        if (pose.isHeadingNorth()) {
            return pose.northOne();
        }
        if (pose.isHeadingSouth()) {
            return pose.southOne();
        }
        if (pose.isHeadingEast()) {
            return pose.eastOne();
        }
        if (pose.isHeadingWest()) {
            return pose.westOne();
        }
        return pose;
    }
}
