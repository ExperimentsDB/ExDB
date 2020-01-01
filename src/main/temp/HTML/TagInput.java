package HTML;

public class TagInput implements Tag {
    private String tag;
    public TagInput(String attributes) {
        tag = "<input " + attributes + ">";
    }

    @Override
    public String toString() {
        return tag;
    }
}
