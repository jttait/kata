package com.passwordstrength.solution;

public class MinimumNumDigitsRule implements Rule {
    private final boolean mandatory;
    private final int minNumChars;

    public MinimumNumDigitsRule(boolean mandatory, int minNumChars) {
        this.mandatory = mandatory;
        this.minNumChars = minNumChars;
    }

    public boolean check(String password) {
        return password.chars().filter(Character::isDigit).count() >= this.minNumChars;
    }

    @Override
    public boolean isMandatory() {
        return this.mandatory;
    }
}
