package HTML;

public class TagNav implements Tag {
    private String openTag;
    private String closeTag;
    private String text;
    public TagNav(String text) {
        openTag = "<nav class=\"navbar navbar-dark bg-dark py-5\">";
        closeTag = "</nav>";
        this.text = text;
    }

    @Override
    public String toString() {
        return openTag + text + closeTag;
    }
}
