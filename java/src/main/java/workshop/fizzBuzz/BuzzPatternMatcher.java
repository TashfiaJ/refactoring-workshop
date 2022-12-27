package fizzBuzz;

public class BuzzPatternMatcher implements IDivisibilityChecker{

    @Override
    public boolean matches(int number) {
        return number % 5 == 0;
    }

    @Override
    public String generateResponse() {
        return "Buzz";
    }
}
