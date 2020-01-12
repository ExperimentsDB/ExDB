package website;

public class WebResult extends WebHtml {
    //Single result template
    public WebResult() {
        html = "\n" +
                "    <a href=\"LINK\">\n" +
                "        <div class=\"card w-100 mt-2\">\n" +
                "            <div class=\"card-body\">\n" +
                "                <h5 class=\"card-title\">TITLE</h5>\n" +
                "                <p class=\"card-text\"><strong>AUTHOR</strong></p>\n" +
                "                <p class=\"card-text\">\n" +
                "                    <div>FIGURE</div>\n" +
                "                    <div>MORPHOTYPE</div>\n" +
                "                    <div>MEASUREMENT</div>\n" +
                "                </p>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </a>";
    }
}
