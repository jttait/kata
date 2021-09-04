package com.passwordstrength.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PasswordCheckerTests {

    @Test
    void testMinimumLengthMet() {
        List<Rule> rules = new ArrayList<>();
        rules.add(new MinimumLengthRule(false,10));
        PasswordChecker checker = new PasswordChecker(rules);
        Assertions.assertTrue(checker.check("abcdefghijkl", 1));
    }

    @Test
    void testMinimumLengthNotMet() {
        List<Rule> rules = new ArrayList<>();
        rules.add(new MinimumLengthRule(false, 10));
        PasswordChecker checker = new PasswordChecker(rules);
        Assertions.assertFalse(checker.check("abc", 1));
    }

    @Test
    void testTwoRulesBothMet() {
        List<Rule> rules = new ArrayList<>();
        rules.add(new MinimumLengthRule(false,10));
        rules.add(new MinimumNumUppercaseRule(false,2));
        PasswordChecker checker = new PasswordChecker(rules);
        Assertions.assertTrue(checker.check("ABcdefghijkl", 2));
    }

    @Test
    void testTwoRulesOneMet() {
        List<Rule> rules = new ArrayList<>();
        rules.add(new MinimumLengthRule(false,10));
        rules.add(new MinimumNumUppercaseRule(false,2));
        PasswordChecker checker = new PasswordChecker(rules);
        Assertions.assertFalse(checker.check("abcdefghijkl", 2));
    }

    @Test
    void testTwoRulesOneMetButOnlyOneNeeded() {
        List<Rule> rules = new ArrayList<>();
        rules.add(new MinimumLengthRule(false,10));
        rules.add(new MinimumNumUppercaseRule(false,2));
        PasswordChecker checker = new PasswordChecker(rules);
        Assertions.assertTrue(checker.check("abcdefghijkl", 1));
    }

    @Test
    void testMandatoryRuleFails() {
        List<Rule> rules = new ArrayList<>();
        rules.add(new MinimumLengthRule(false,10));
        rules.add(new MinimumNumUppercaseRule(true,2));
        PasswordChecker checker = new PasswordChecker(rules);
        Assertions.assertFalse(checker.check("abcdefghijkl", 1));
    }

    @Test
    void testAllRulesPass() {
        List<Rule> rules = new ArrayList<>();
        rules.add(new MinimumLengthRule(false,10));
        rules.add(new MinimumNumUppercaseRule(false,2));
        rules.add(new MinimumNumLowercaseRule(false,2));
        rules.add(new MinimumNumDigitsRule(false, 2));
        rules.add(new MinimumNumSpecialCharRule(false, 2, "!$&"));
        PasswordChecker checker = new PasswordChecker(rules);
        Assertions.assertTrue(checker.check("ABCdef123!$&", 5));
    }

}
