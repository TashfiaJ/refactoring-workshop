package plainTextToHTMLConverter;

public class NullResponse implements IPatternMatcher{
    @Override
    public boolean matches(String plainText) {
        return false;
    }

    @Override
    public String generateResponse() {
        return "";
    }
}
