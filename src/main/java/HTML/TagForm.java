package HTML;

import java.util.ArrayList;

public class TagForm implements Tag {
    private String content;
    private String openTag;
    private String closeTag;
    public TagForm(String attributes) {
        openTag = "<form " + attributes + ">";
        closeTag = "</form>";
        content = "";
    }
    public TagForm(String attributes, String content) {
        openTag = "<form " + attributes + ">";
        closeTag = "</form>";
        this.content = content;

    }

    public void addContent(Tag tag) {
        content+=tag.toString();
    }
    public void addContent(String newContent) {
        content+=newContent;
    }

    @Override
    public String toString() {
        return openTag+content+closeTag;
    }
}
