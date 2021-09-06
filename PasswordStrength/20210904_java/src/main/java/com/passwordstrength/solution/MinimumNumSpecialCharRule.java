package com.passwordstrength.solution;

public class MinimumNumSpecialCharRule implements Rule {
    private final boolean mandatory;
    private final int minNumChars;
    private final String chars;

    public MinimumNumSpecialCharRule(boolean mandatory, int minNumChars, String chars) {
        this.mandatory = mandatory;
        this.minNumChars = minNumChars;
        this.chars = chars;
    }

    public boolean check(String password) {
        return password.chars().filter(this::isSpecial).count() >= this.minNumChars;
    }

    private boolean isSpecial(int intCh) {
        char ch = (char) intCh;
        return this.chars.contains(Character.toString(ch));
    }

    @Override
    public boolean isMandatory() {
        return this.mandatory;
    }
}
