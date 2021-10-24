package example.micronaut;

import java.util.ArrayList;
import java.util.List;

public class PasswordStrengthChecker {

    private final List<Criterion> criteria;

    PasswordStrengthChecker(List<Criterion> criteria) {
        this.criteria = criteria;
    }

    PasswordStrengthChecker() {
        this.criteria = new ArrayList<>();
        this.criteria.add(new LengthCriterion(8));
        this.criteria.add(new LowercaseCriterion(1));
        this.criteria.add(new UppercaseCriterion(1));
        this.criteria.add(new DigitsCriterion(1));
        this.criteria.add(new SpecialCriterion(1));
    }

    public boolean check(String password) {
        return criteria.stream().allMatch(criterion -> criterion.check(password));
    }

    public boolean check(String password, int minPassingCriteria) {
        long numPassing = criteria.stream().filter(criterion -> criterion.check(password)).count();
        boolean anyMandatoryFailing = criteria.stream()
                .anyMatch(criterion -> !criterion.check(password) && criterion.isMandatory());
        return numPassing >= minPassingCriteria && !anyMandatoryFailing;
    }
}
