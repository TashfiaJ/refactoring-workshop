package plainTextToHTMLConverter;

public class NewLinePatternMatcher implements IPatternMatcher{
    @Override
    public boolean matches(String plainText) {
        return plainText.equals("\n");
    }

    @Override
    public String generateResponse() {
        return "<br />";
    }
}
