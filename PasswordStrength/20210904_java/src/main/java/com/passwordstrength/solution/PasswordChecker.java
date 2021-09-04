package com.passwordstrength.solution;

import java.util.List;

public class PasswordChecker {

    private final List<Rule> rules;

    public PasswordChecker(List<Rule> rules) {
        this.rules = rules;
    }

    public boolean check(String password, int passesRequired) {
        int rulesPassed = 0;
        for (Rule rule : rules) {
            boolean rulePassed = rule.check(password);
            if (!rulePassed && rule.isMandatory()) {
                return false;
            }
            if (rulePassed) {
                rulesPassed++;
            }
        }
        return rulesPassed >= passesRequired;
    }
}
