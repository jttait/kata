package com.passwordstrength.solution;

public class MinimumNumUppercaseRule implements Rule {
    private final int minNumChars;
    private final boolean mandatory;

    public MinimumNumUppercaseRule(boolean mandatory, int minNumChars) {
        this.mandatory = mandatory;
        this.minNumChars = minNumChars;
    }

    @Override
    public boolean check(String password) {
        return password.chars().filter(Character::isUpperCase).count() >= this.minNumChars;
    }

    @Override
    public boolean isMandatory() {
        return this.mandatory;
    }
}
