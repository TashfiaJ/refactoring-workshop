package fizzBuzz;

import java.util.List;

public class FizzBuzz {
    private List<PatternMatcher> patternMatchers;
    public FizzBuzz(List<PatternMatcher> patternMatchers) {
        this.patternMatchers = patternMatchers;
    }

    public String say(int number) {
        String strReturn = String.valueOf(number);

        for (PatternMatcher patternMatcher : patternMatchers) {
            if (patternMatcher.matches(number)) strReturn = patternMatcher.generateResponse();
        }

        return strReturn;
    }
}
