package com.passwordstrength.solution;

public class MinimumNumLowercaseRule implements Rule {
    private final int minNumChars;
    private boolean mandatory;

    public MinimumNumLowercaseRule(boolean mandatory, int minNumChars) {
        this.mandatory = mandatory;
        this.minNumChars = minNumChars;
    }

    public boolean check(String password) {
        return password.chars().filter(Character::isLowerCase).count() >= this.minNumChars;
    }

    @Override
    public boolean isMandatory() {
        return this.mandatory;
    }
}
