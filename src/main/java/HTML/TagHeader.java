package HTML;

public class TagHeader implements Tag {
    private String header;
    public TagHeader() {
        TagNav nav = new TagNav("<a class=\"navbar-brand\" href=\"#\">\n" +
                "        <h1>ExDB</h1>\n" +
                "      </a>\n" +
                "      <form class=\"form-inline\">\n" +
                "        <input\n" +
                "          class=\"form-control mr-sm-2\"\n" +
                "          type=\"search\"\n" +
                "          placeholder=\"Search\"\n" +
                "          aria-label=\"Search\"\n" +
                "        />\n" +
                "        <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">\n" +
                "          Search\n" +
                "        </button>\n" +
                "      </form>");
        header = nav.toString();

    }

    @Override
    public String toString() {
        return header;
    }
}
