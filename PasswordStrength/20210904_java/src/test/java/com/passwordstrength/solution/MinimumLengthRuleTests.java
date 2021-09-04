package com.passwordstrength.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumLengthRuleTests {

    @Test
    void returnTrueWhenLengthMeetsRule() {
        MinimumLengthRule rule = new MinimumLengthRule(false,10);
        Assertions.assertTrue(rule.check("abcdefghijkl"));
    }

    @Test
    void returnTrueWhenLengthDoesNotMeetRule() {
        MinimumLengthRule rule = new MinimumLengthRule(false,10);
        Assertions.assertFalse(rule.check("abc"));
    }

}
