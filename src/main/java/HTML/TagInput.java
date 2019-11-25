package HTML;

public class TagInput implements Tag {
    private String tag;
    public TagInput(String type, String name) {
        tag = "<input type=\"" + type +"\" name=\""+name+"\" />";
    }

    @Override
    public String toString() {
        return tag;
    }
}
