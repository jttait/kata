package example.micronaut;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LengthCriterionTest {

    @Test
    void shouldBeTrueIfGreaterThanMinimum() {
        assertTrue(new LengthCriterion(5).check("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void shouldBeTrueIfEqualToMinimum() {
        assertTrue(new LengthCriterion(5).check("abcde"));
    }

    @Test
    void shouldBeFalseIfLessThanMinimum() {
        assertFalse(new LengthCriterion(5).check("abc"));
    }
}
