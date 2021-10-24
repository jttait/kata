package example.micronaut;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordStrengthCheckerTest {

    @Test
    void shouldReturnTrueIfOneCriterionWhichIsTrue() {
        List<Criterion> criteria = List.of(new LengthCriterion(5));
        PasswordStrengthChecker checker = new PasswordStrengthChecker(criteria);

        assertTrue(checker.check("abcdefgh", 1));
    }

    @Test
    void shouldReturnTrueIfTwoCriteriaWhichAreTrue() {
        List<Criterion> criteria = new ArrayList<>();
        criteria.add(new LengthCriterion(5));
        criteria.add(new LowercaseCriterion(5));
        PasswordStrengthChecker checker = new PasswordStrengthChecker(criteria);

        assertTrue(checker.check("abcdefgh", 2));
    }

    @Test
    void shouldReturnFalseIfOneCriterionTrueAndOneCriterionFalse() {
        List<Criterion> criteria = new ArrayList<>();
        criteria.add(new LengthCriterion(5));
        criteria.add(new LowercaseCriterion(5));
        PasswordStrengthChecker checker = new PasswordStrengthChecker(criteria);

        assertFalse(checker.check("ABCDEFGHIJ", 2));
    }

    @Test
    void shouldReturnFalseIfMandatoryCriterionFalse() {
        List<Criterion> criteria = new ArrayList<>();
        criteria.add(new LengthCriterion(5));
        criteria.add(new LowercaseCriterion(5, true));
        PasswordStrengthChecker checker = new PasswordStrengthChecker();

        assertFalse(checker.check("ABCDEFGHIJ", 1));
    }
}
