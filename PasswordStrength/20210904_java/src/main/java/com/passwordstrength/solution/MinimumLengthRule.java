package com.passwordstrength.solution;

public class MinimumLengthRule implements Rule {
    private final int minimumLength;
    private boolean mandatory;

    public MinimumLengthRule(boolean mandatory, int minimumLength) {
        this.mandatory = mandatory;
        this.minimumLength = minimumLength;
    }

    public boolean check(String password) {
        return password.length() >= minimumLength;
    }

    @Override
    public boolean isMandatory() {
        return this.mandatory;
    }
}
