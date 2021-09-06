package com.passwordstrength.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumNumSpecialCharRuleTests {

    @Test
    void returnTrueWhenNumMeetsRule() {
        MinimumNumSpecialCharRule rule = new MinimumNumSpecialCharRule(false,2, "!$");
        Assertions.assertTrue(rule.check("abcd!$"));
    }

    @Test
    void returnTrueWhenNumDoesNotMeetRule() {
        MinimumNumSpecialCharRule rule = new MinimumNumSpecialCharRule(false,2, "!$");
        Assertions.assertFalse(rule.check("abcdefgh"));
    }

}