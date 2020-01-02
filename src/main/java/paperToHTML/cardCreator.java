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
        String template = "\n" +
                "    <a href=\"LINK\">\n" +
                "        <div class=\"card w-100 mt-2\">\n" +
                "            <div class=\"card-body\">\n" +
                "                <h5 class=\"card-title\">TITLE</h5>\n" +
                "                <p class=\"card-text\"><strong>AUTHOR</strong></p>\n" +
                "                <p class=\"card-text\">TEXT</p>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </a>";
        template = template.replace("LINK", this.link);
        //template = template.replace("TITLE", "");
        template = template.replace("AUTHOR", this.author);
        //template = template.replace("TEXT", this.text);
        return template;
    }

}
