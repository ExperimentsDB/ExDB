package HTML;

public class TagButton implements Tag{
    private String openTag;
    private String closeTag;
    private String content;
    public  TagButton(String attributes, String content){
        openTag = "<button " + attributes + ">";
        closeTag = "</button>";
        this.content = content;
    }

    @Override
    public String toString() {
        return openTag + content + closeTag;
    }
}
