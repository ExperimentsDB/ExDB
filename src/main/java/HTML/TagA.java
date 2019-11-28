package HTML;

public class TagA implements Tag {
    private String openTag;
    private String closeTag;
    private String text;
    public TagA(String text) {
        openTag = "<a>";
        closeTag = "</a>";
        this.text = text;
    }

    @Override
    public String toString() {
        return openTag + text + closeTag;
    }
}
