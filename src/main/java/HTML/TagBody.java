package HTML;

import java.util.ArrayList;

public class TagBody implements Tag {
    private ArrayList<Tag> children;
    private String openTag;
    private String closeTag;
    public TagBody() {
        openTag = "<body>";
        closeTag = "</body>";
        children = new ArrayList<>();
    }

    public void addChild(Tag tag) {
        children.add(tag);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder(openTag);
        for(Tag child : children) {
            out.append(child.toString());
        }
        out.append(closeTag);
        return out.toString();
    }
}
