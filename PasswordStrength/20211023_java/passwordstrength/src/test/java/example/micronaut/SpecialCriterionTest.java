package example.micronaut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpecialCriterionTest {
    @Test
    void shouldBeTrueIfGreaterThanMinimum() {
        assertTrue(new SpecialCriterion(5, "!$%^&*#").check("!$%^&*!$%^"));
    }

    @Test
    void shouldBeTrueIfEqualToMinimum() {
        assertTrue(new SpecialCriterion(5, "!$%^&*#").check("!$%^*"));
    }

    @Test
    void shouldBeFalseIfLessThanMinimum() {
        assertFalse(new SpecialCriterion(5, "!$%^&*#").check("1!$abc"));
    }
}
