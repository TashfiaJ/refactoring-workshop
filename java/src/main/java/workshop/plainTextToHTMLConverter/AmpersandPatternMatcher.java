package plainTextToHTMLConverter;

public class AmpersandPatternMatcher implements IPatternMatcher {
    @Override
    public boolean matches(String plainText) {
        return plainText.equals("&");
    }

    @Override
    public String generateResponse() {
        return "&amp;";
    }
}
