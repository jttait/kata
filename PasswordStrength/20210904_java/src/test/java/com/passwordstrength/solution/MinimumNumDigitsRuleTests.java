package com.passwordstrength.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumNumDigitsRuleTests {

    @Test
    void returnTrueWhenNumMeetsRule() {
        MinimumNumDigitsRule rule = new MinimumNumDigitsRule(false,2);
        Assertions.assertTrue(rule.check("abcd1234"));
    }

    @Test
    void returnTrueWhenNumDoesNotMeetRule() {
        MinimumNumDigitsRule rule = new MinimumNumDigitsRule(false,2);
        Assertions.assertFalse(rule.check("abcdefgh"));
    }

}