package com.passwordstrength.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumNumLowercaseRuleTests {

    @Test
    void returnTrueWhenLengthMeetsRule() {
        MinimumNumLowercaseRule rule = new MinimumNumLowercaseRule(false,2);
        Assertions.assertTrue(rule.check("abcdEFGH"));
    }

    @Test
    void returnTrueWhenLengthDoesNotMeetRule() {
        MinimumNumLowercaseRule rule = new MinimumNumLowercaseRule(false,2);
        Assertions.assertFalse(rule.check("ABCDEFGH"));
    }

}