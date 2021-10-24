package example.micronaut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DigitsCriterionTest {

    @Test
    void shouldBeTrueIfGreaterThanMinimum() {
        assertTrue(new DigitsCriterion(5).check("123456789"));
    }

    @Test
    void shouldBeTrueIfEqualToMinimum() {
        assertTrue(new DigitsCriterion(5).check("12345"));
    }

    @Test
    void shouldBeFalseIfLessThanMinimum() {
        assertFalse(new DigitsCriterion(5).check("123abc"));
    }
}
