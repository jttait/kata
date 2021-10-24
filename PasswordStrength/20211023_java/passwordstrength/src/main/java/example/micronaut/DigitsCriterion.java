package example.micronaut;

public class DigitsCriterion implements Criterion {
    private final int minimumOccurrences;
    private final boolean mandatory;

    public DigitsCriterion(int minimumOccurrences) {
        this.minimumOccurrences = minimumOccurrences;
        this.mandatory = false;
    }

    public DigitsCriterion(int minimumOccurrences, boolean mandatory) {
        this.minimumOccurrences = minimumOccurrences;
        this.mandatory = mandatory;
    }

    @Override
    public boolean check(String password) {
        return password.chars().filter(Character::isDigit).count() >= minimumOccurrences;
    }

    @Override
    public boolean isMandatory() {
        return this.mandatory;
    }
}
