package plainTextToHTMLConverter;

public class GreaterThanPatternMatcher implements PatternMatcher{
    @Override
    public boolean matches(String plainText) {
        return plainText.equals(">");
    }

    @Override
    public String generateResponse() {
        return "&gt;";
    }
}