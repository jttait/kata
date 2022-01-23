package marsrover;

import java.util.Objects;

public class Rover {
    private final Pose pose;
    private final Instructions instructions;

    public Rover(Pose pose, Instructions instructions) {
        this.pose = pose;
        this.instructions = instructions;
    }

    public Rover executeAllInstructions() {
        Rover newRover = new Rover(pose, instructions);
        while (newRover.hasNextInstruction()) {
            newRover = newRover.executeNextInstruction();
        }
        return newRover;
    }

    public Rover executeNextInstruction() {
        Instruction nextInstruction = instructions.getNextInstruction();
        Instructions newInstructions = instructions.removeNextInstruction();
        Pose newPose = pose.update(nextInstruction);
        return new Rover(newPose, newInstructions);
    }

    public boolean hasNextInstruction() {
        return this.instructions.hasNextInstruction();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return pose.equals(rover.pose) && instructions.equals(rover.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pose, instructions);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "pose=" + pose +
                ", instructions=" + instructions +
                '}';
    }
}
