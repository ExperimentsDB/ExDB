package searchDB;

public class ResultDB {
    private String title;
    private String author;
    private String link;
    private String text;

    public ResultDB(String title, String author, String link, String text) {
        this.title = title;
        this.author = author;
        this.link = link;
        this.text = text;
    }

    @Override
    public String toString() {
        String template = "<div class=\"col-12 d-flex my-2\">\n" +
                "            <a href=\"LINK\" >" +
                "              <div class=\"card w-100\">\n" +
                "                <div class=\"card-body\">\n" +
                "                    <h5 class=\"card-title\">TITLE</h5>\n" +
                "                    <p class=\"card-text\"><strong>AUTHOR</strong></p>\n" +
                "                    <p class=\"card-text\">TEXT</a>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </a>" +
                "        </div>";
        template = template.replace("LINK", this.link);
        template = template.replace("TITLE", this.title);
        template = template.replace("AUTHOR", this.author);
        template = template.replace("TEXT", this.text);
        return template;
    }
}
