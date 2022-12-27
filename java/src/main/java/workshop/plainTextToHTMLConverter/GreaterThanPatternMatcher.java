package plainTextToHTMLConverter;

public class GreaterThanPatternMatcher implements IPatternMatcher{
    @Override
    public boolean matches(String plainText) {
        return plainText.equals(">");
    }

    @Override
    public String generateResponse() {
        return "&gt;";
    }
}
