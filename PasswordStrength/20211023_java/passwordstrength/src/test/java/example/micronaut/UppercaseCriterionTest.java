package example.micronaut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UppercaseCriterionTest {

    @Test
    void shouldBeTrueIfGreaterThanMinimum() {
        assertTrue(new UppercaseCriterion(5).check("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    void shouldBeTrueIfEqualToMinimum() {
        assertTrue(new UppercaseCriterion(5).check("ABCDEfghijk"));
    }

    @Test
    void shouldBeFalseIfLessThanMinimum() {
        assertFalse(new UppercaseCriterion(5).check("ABCdefghijk"));
    }
}
