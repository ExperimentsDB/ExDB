package searchDB;

import website.FileToString;

import java.util.ArrayList;

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
        String template = new FileToString("result.html").toString();
        template = template.replace("LINK", this.link);
        template = template.replace("TITLE", this.title);
        template = template.replace("AUTHOR", this.author);
        template = template.replace("TEXT", this.text);
        return template;
    }

}
