package HTML;

public class TagDiv implements Tag {
    private String openTag;
    private String closeTag;
    private String text;
    public TagDiv(String text) {
        openTag = "<div>";
        closeTag = "</div>";
        this.text = text;
    }

    @Override
    public String toString() {
        return openTag + text + closeTag;
    }
}
