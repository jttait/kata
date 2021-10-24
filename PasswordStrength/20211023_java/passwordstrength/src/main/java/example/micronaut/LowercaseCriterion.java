package example.micronaut;

public class LowercaseCriterion implements Criterion {
    private final int minimumOccurrences;
    private final boolean mandatory;

    public LowercaseCriterion(int minimumOccurrences) {
        this.minimumOccurrences = minimumOccurrences;
        this.mandatory = false;
    }

    public LowercaseCriterion(int minimumOccurrences, boolean mandatory) {
        this.minimumOccurrences = minimumOccurrences;
        this.mandatory = mandatory;
    }

    public boolean check(String password) {
        return password.chars().filter(Character::isLowerCase).count() >= minimumOccurrences;
    }

    public boolean isMandatory() {
        return this.mandatory;
    }
}
