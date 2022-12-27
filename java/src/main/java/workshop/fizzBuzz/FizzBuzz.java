package fizzBuzz;

import java.util.List;

public class FizzBuzz {
    private List<IDivisibilityChecker> divisibilityCheckers;
    public FizzBuzz(List<IdivisibilityChecker> divisibilityCheckers) {
        this.divisibilityCheckers = divisibilityCheckers;
    }

    public String checkNumber(int number) {
        String strReturn = String.valueOf(number);

        for (IDivisibilityChecker divisibilityChecker : divisibilityCheckers) {
            if (divisibilityChecker.matches(number)) strReturn = divisibilityChecker.generateResponse();
        }

        return strReturn;
    }
}
