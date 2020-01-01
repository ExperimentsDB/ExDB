package HTML;

public class TagHeader implements Tag {
    private String header;
    public TagHeader() {

    }
    public TagHeader(String content) {
        header = content;
    }

    public void addContent(String newContent){
        header+=newContent;
    }

    @Override
    public String toString() {
        return header;
    }
}
