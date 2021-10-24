package example.micronaut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LowercaseCriterionTest {

    @Test
    void shouldBeTrueIfGreaterThanMinimum() {
        assertTrue(new LowercaseCriterion(5).check("abcdefghiJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    void shouldBeTrueIfEqualToMinimum() {
        assertTrue(new LowercaseCriterion(5).check("abcdeFGHIJKL"));
    }

    @Test
    void shouldBeFalseIfLessThanMinimum() {
        assertFalse(new LowercaseCriterion(5).check("abcDEFGHIJK"));
    }
}
