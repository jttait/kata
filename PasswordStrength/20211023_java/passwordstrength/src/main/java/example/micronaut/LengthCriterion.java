package example.micronaut;

public class LengthCriterion implements Criterion {

    private final int minimumLength;
    private final boolean mandatory;

    public LengthCriterion(int minimumLength) {
        this.minimumLength = minimumLength;
        this.mandatory = false;
    }

    public LengthCriterion(int minimumLength, boolean mandatory) {
        this.minimumLength = minimumLength;
        this.mandatory = mandatory;
    }

    public boolean check(String password) {
        return password.length() >= this.minimumLength;
    }

    public boolean isMandatory() {
        return this.mandatory;
    }
}
