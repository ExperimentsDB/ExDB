package website;

public class webResult extends webHtml {
    //Single result template
    public webResult(){
        html = "\n" +
                "    <a href=\"LINK\">\n" +
                "        <div class=\"card w-100 mt-2\">\n" +
                "            <div class=\"card-body\">\n" +
                "                <h5 class=\"card-title\">TITLE</h5>\n" +
                "                <p class=\"card-text\"><strong>AUTHOR</strong></p>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </a>";
    }
}
