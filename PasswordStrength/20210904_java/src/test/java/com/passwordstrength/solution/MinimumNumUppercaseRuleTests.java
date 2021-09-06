package com.passwordstrength.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumNumUppercaseRuleTests {

    @Test
    void returnTrueWhenLengthMeetsRule() {
        MinimumNumUppercaseRule rule = new MinimumNumUppercaseRule(false,2);
        Assertions.assertTrue(rule.check("ABcdefghijkl"));
    }

    @Test
    void returnTrueWhenLengthDoesNotMeetRule() {
        MinimumNumUppercaseRule rule = new MinimumNumUppercaseRule(false,2);
        Assertions.assertFalse(rule.check("abcdefghijkl"));
    }

}