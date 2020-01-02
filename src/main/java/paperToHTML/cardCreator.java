package paperToHTML;

import Papers.*;

import website.webResult;

// Class for creating a result card using the result template
public class cardCreator {

    private String author;
    private String link;


    public cardCreator(Paper paperin) {

        this.author = paperin.getAuthor();
        this.link = paperin.getLink();

    }

    @Override
    public String toString() {
        // Takes result template and replaces the fields
        String template = new webResult().toString();
        template = template.replace("LINK", this.link);
        //template = template.replace("TITLE", "");
        template = template.replace("AUTHOR", this.author);
        //template = template.replace("TEXT", this.text);
        return template;
    }

}
