package paperToHTML;

import Papers.*;

import website.webResult;

// Class for creating a result card using the result template
public class cardCreator {

    private String author;
    private String link;
    private int id;


    public cardCreator(Paper paperin) {

        author = paperin.getAuthor();
        link = paperin.getLink();
        id = paperin.getId();

    }

    @Override
    public String toString() {
        // Takes result template and replaces the fields
        String template = new webResult().toString();
        template = template.replace("LINK", link);
        template = template.replace("TITLE", "Paper " + id);
        template = template.replace("AUTHOR", author);
        return template;
    }

}
