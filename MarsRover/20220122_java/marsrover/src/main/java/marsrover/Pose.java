package marsrover;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pose {

    private final Position position;
    private final Heading heading;

    Pose(Position position, Heading heading) {
        this.position = position;
        this.heading = heading;
    }

    public Pose update(Instruction instruction) {
        Map<Instruction, Pose> map = new HashMap<>();
        map.put(Instruction.FORWARD, forward());
        map.put(Instruction.REVERSE, reverse());
        map.put(Instruction.CLOCKWISE, clockwise());
        map.put(Instruction.ANTICLOCKWISE, anticlockwise());
        return map.get(instruction);
    }

    public Pose forward() {
        Map<Heading, Position> map = new HashMap<>();
        map.put(Heading.NORTH, position.northOne());
        map.put(Heading.EAST, position.eastOne());
        map.put(Heading.SOUTH, position.southOne());
        map.put(Heading.WEST, position.westOne());
        return new Pose(map.get(heading), heading);
    }

    public Pose reverse() {
        Map<Heading, Position> map = new HashMap<>();
        map.put(Heading.NORTH, position.southOne());
        map.put(Heading.EAST, position.westOne());
        map.put(Heading.SOUTH, position.northOne());
        map.put(Heading.WEST, position.eastOne());
        return new Pose(map.get(heading), heading);
    }

    public Pose clockwise() {
        Map<Heading, Heading> map = new HashMap<>();
        map.put(Heading.NORTH, Heading.EAST);
        map.put(Heading.EAST, Heading.SOUTH);
        map.put(Heading.SOUTH, Heading.WEST);
        map.put(Heading.WEST, Heading.NORTH);
        return new Pose(position, map.get(heading));
    }

    public Pose anticlockwise() {
        Map<Heading, Heading> map = new HashMap<>();
        map.put(Heading.NORTH, Heading.WEST);
        map.put(Heading.EAST, Heading.NORTH);
        map.put(Heading.SOUTH, Heading.EAST);
        map.put(Heading.WEST, Heading.SOUTH);
        return new Pose(position, map.get(heading));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pose pose = (Pose) o;
        return position.equals(pose.position) && heading == pose.heading;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, heading);
    }

    @Override
    public String toString() {
        return "Pose{" +
                "position=" + position +
                ", heading=" + heading +
                '}';
    }
}
