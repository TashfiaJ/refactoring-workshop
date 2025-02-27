package fizzBuzz;

public class FizzPatternMatcher implements IDivisibilityChecker{

    @Override
    public boolean matches(int number) {
        return number % 3 == 0;
    }

    @Override
    public String generateResponse() {
        return "Fizz";
    }


}
