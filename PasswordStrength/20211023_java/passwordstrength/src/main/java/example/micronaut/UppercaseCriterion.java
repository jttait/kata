package example.micronaut;

public class UppercaseCriterion implements Criterion {
    private final int minimumOccurrences;
    private final boolean mandatory;

    public UppercaseCriterion(int minimumOccurrences) {
        this.minimumOccurrences = minimumOccurrences;
        this.mandatory = false;
    }

    public UppercaseCriterion(int minimumOccurrences, boolean mandatory) {
        this.minimumOccurrences = minimumOccurrences;
        this.mandatory = mandatory;
    }

    public boolean check(String password) {
        return password.chars().filter(Character::isUpperCase).count() >= minimumOccurrences;
    }

    public boolean isMandatory() {
        return this.mandatory;
    }
}
