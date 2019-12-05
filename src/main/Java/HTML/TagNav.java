package HTML;

public class TagNav implements Tag {
    private String openTag;
    private String closeTag;
    private String content;
    public TagNav(String content) {
        openTag = "<nav>";
        closeTag = "</nav>";
        this.content = content;
    }
    public TagNav(String attributes, String content) {
        openTag = "<nav " + attributes + ">";
        closeTag = "</nav>";
        this.content = content;
    }

    @Override
    public String toString() {
        return openTag + content + closeTag;
    }
}
