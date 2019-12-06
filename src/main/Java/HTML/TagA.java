package HTML;

public class TagA implements Tag {
    private String openTag;
    private String closeTag;
    private String content;
    public TagA(String attributes, String content) {
        openTag = "<a "+ attributes +">";
        closeTag = "</a>";
        this.content = content;
    }
    public TagA(String content) {
        openTag = "<a>";
        closeTag = "</a>";
        this.content = content;
    }

    @Override
    public String toString() {
        return openTag + content + closeTag;
    }
}
