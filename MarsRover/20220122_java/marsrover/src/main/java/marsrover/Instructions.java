package marsrover;

import java.util.Objects;
import java.util.Stack;

public class Instructions {

    private final Stack<Instruction> collection;

    Instructions() {
        this.collection = new Stack<>();
    }

    public void add(Instruction instruction) {
        this.collection.push(instruction);
    }

    public Instruction getNextInstruction() {
        return this.collection.peek();
    }

    public Instructions removeNextInstruction() {
        this.collection.pop();
        Instructions newInstructions = new Instructions();
        for (Instruction instruction : this.collection) {
            newInstructions.add(instruction);
        }
        return newInstructions;
    }

    public boolean hasNextInstruction() {
        return !this.collection.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instructions that = (Instructions) o;
        return collection.equals(that.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection);
    }

    @Override
    public String toString() {
        return "Instructions{" +
                "collection=" + collection +
                '}';
    }
}
