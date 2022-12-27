package fizzBuzz;

public class FizzBuzzPatternMatcher implements IDivisibilityChecker{
    @Override
    public boolean matches(int number) {
        return number % 15 == 0;
    }

    @Override
    public String generateResponse() {
        return "FizzBuzz";
    }
}
