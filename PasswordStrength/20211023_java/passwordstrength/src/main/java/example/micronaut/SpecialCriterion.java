package example.micronaut;

public class SpecialCriterion implements Criterion {
    private final int minimumOccurrences;
    private final String specialCharacters;
    private final boolean mandatory;

    public SpecialCriterion(int minimumOccurrences) {
        this.minimumOccurrences = minimumOccurrences;
        this.specialCharacters = "!$%^&*#";
        this.mandatory = false;
    }

    public SpecialCriterion(int minimumOccurrences, String specialCharacters) {
        this.minimumOccurrences = minimumOccurrences;
        this.specialCharacters = specialCharacters;
        this.mandatory = false;
    }

    public SpecialCriterion(int minimumOccurrences, String specialCharacters, boolean mandatory) {
        this.minimumOccurrences = minimumOccurrences;
        this.specialCharacters = specialCharacters;
        this.mandatory = mandatory;
    }

    @Override
    public boolean check(String password) {
        return password.chars().filter(this::isSpecial).count() >= minimumOccurrences;
    }

    @Override
    public boolean isMandatory() {
        return this.mandatory;
    }

    private boolean isSpecial(int intCharacter) {
        return specialCharacters.contains(Character.valueOf((char) intCharacter).toString());
    }
}
