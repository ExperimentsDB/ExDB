package HTML;

public class HTML implements Tag {
    private String openTag;
    private String closeTag;
    private TagHead head;
    private TagBody body;

    public HTML() {
        openTag = "<html>";
        closeTag = "</html>";
        head = new TagHead();
        body = new TagBody();
    }

    public void addtoBody(Tag tag) {
        body.addChild(tag);
    }

    @Override
    public String toString() {
        return openTag + head +
                body +
                closeTag;
    }
}
