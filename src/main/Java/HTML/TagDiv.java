package HTML;

public class TagDiv implements Tag {
    private String openTag;
    private String closeTag;
    private String content;
    public TagDiv(String content) {
        openTag = "<div>";
        closeTag = "</div>";
        this.content = content;
    }
    public TagDiv(String attributes, String content) {
        openTag = "<div " + attributes + ">";
        closeTag = "</div>";
        this.content = content;
    }

    @Override
    public String toString() {
        return openTag + content + closeTag;
    }
}
