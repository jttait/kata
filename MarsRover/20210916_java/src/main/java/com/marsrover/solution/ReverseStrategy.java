package com.marsrover.solution;

public class ReverseStrategy implements InstructionStrategy {
    public Pose execute(Pose pose) {
        if (pose.isHeadingNorth()) {
            return pose.southOne();
        }
        if (pose.isHeadingSouth()) {
            return pose.northOne();
        }
        if (pose.isHeadingEast()) {
            return pose.westOne();
        }
        if (pose.isHeadingWest()) {
            return pose.eastOne();
        }
        return pose;
    }
}
