package paperToHTML;

import Papers.*;

import website.FileToString;

public class cardCreator {

    private String author;
    private String link;


    public cardCreator(Paper paperin) {

        this.author = paperin.getAuthor();
        this.link = paperin.getLink();

    }

    @Override
    public String toString() {
        String template = new FileToString("result.html").toString();
        template = template.replace("LINK", this.link);
        //template = template.replace("TITLE", "");
        template = template.replace("AUTHOR", this.author);
        //template = template.replace("TEXT", this.text);
        return template;
    }

}
