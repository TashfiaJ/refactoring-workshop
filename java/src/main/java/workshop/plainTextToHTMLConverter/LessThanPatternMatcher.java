package plainTextToHTMLConverter;

public class LessThanPatternMatcher implements IPatternMatcher{
    @Override
    public boolean matches(String plainText) {
        return plainText.equals("<");
    }

    @Override
    public String generateResponse() {
        return "&lt;";
    }
}
