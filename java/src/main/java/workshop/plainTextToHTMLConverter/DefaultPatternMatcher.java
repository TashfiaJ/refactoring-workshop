package plainTextToHTMLConverter;

public class DefaultPatternMatcher implements IPatternMatcher{
    private String strReturn;
    @Override
    public boolean matches(String plainText) {
        this.strReturn = plainText;
        return true;
    }

    @Override
    public String generateResponse() {
        return this.strReturn;
    }
}
