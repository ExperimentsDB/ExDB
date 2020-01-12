package paperToHTML;

import papers.*;

import website.WebResult;

// Class for creating a result card using the result template
public class CardCreator {

    private String author;
    private String link;
    private int id;
    private String figure;
    private String morphotype;
    private String units;


    public CardCreator(Paper paperin) {

        author = paperin.getAuthor();
        link = paperin.getLink();
        id = paperin.getId();
        figure = paperin.getFigure();
        morphotype = paperin.getMorphotype();
        units = paperin.getUnits();

    }

    @Override
    public String toString() {
        // Takes result template and replaces the fields
        String template = new WebResult().toString();
        template = template.replace("LINK", link);
        template = template.replace("TITLE", "Paper " + id);
        template = template.replace("AUTHOR", author);
        template = template.replace("FIGURE", "Figure: " + figure);
        template = template.replace("MORPHOTYPE", "Morphotype: " + morphotype);
        template = template.replace("MEASUREMENT", "Measurement units: " + units);
        return template;
    }

}
