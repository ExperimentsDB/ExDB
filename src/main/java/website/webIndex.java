package website;

public class webIndex extends webHtml{

    public webIndex(){
        // Home page
        html = "<!DOCTYPE html>\n" +
                "<html class=\"h-100\">\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\" />\n" +
                "  <meta\n" +
                "          name=\"viewport\"\n" +
                "          content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\"\n" +
                "  />\n" +
                "  <meta name=\"description\" content=\"\" />\n" +
                "  <meta name=\"author\" content=\"\" />\n" +
                "  <title>Experimental DB</title>\n" +
                "  <link\n" +
                "          rel=\"stylesheet\"\n" +
                "          href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/css/bootstrap.min.css\"\n" +
                "          integrity=\"sha384-SI27wrMjH3ZZ89r4o+fGIJtnzkAnFs3E4qz9DIYioCQ5l9Rd/7UAa8DHcaL8jkWt\"\n" +
                "          crossorigin=\"anonymous\"\n" +
                "  />\n" +
                "  <link rel=\"stylesheet\" href=\"/style.css\">\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"h-100\">\n" +
                "<!-- Navbar code -->\n" +
                "<nav class=\"navbar navbar-dark bg-dark\">\n" +
                "  <a class=\"navbar-brand\" href=\"/\">ExDB</a>\n" +
                "  <form class=\"form-inline btn-toolbar\">\n" +
                "    <div class=\"btn-toolbar\">\n" +
                "      <a\n" +
                "              class=\"btn btn-success my-2 mx-2 my-sm-0\"\n" +
                "              href=\"/signin\"\n" +
                "              role=\"button\"\n" +
                "      >Sign in</a\n" +
                "      >\n" +
                "      <a\n" +
                "              class=\"btn btn-success my-2 mx-2 my-sm-0\"\n" +
                "              href=\"/register\"\n" +
                "              role=\"button\"\n" +
                "      >Register</a\n" +
                "      >\n" +
                "    </div>\n" +
                "  </form>\n" +
                "</nav>\n" +
                "\n" +
                "<div class=\"container h-100\">\n" +
                "  <div class=\"row h-25 px-2 align-items-center\">\n" +
                "    <h1> <strong> Experimental database </strong></h1>\n" +
                "  </div>\n" +
                "  <div class=\"row h-75 px-2\">\n" +
                "    <div class=\"col-md-4\">\n" +
                "      <div class=\"row px-2\">\n" +
                "        <p align=\"justify\"><strong>Purpose</strong><br>\n" +
                "          Our goal is to provide researchers with a tool to streamline their research, minimise wasteful use of their time and funding, all the while minimising animal testing! This is all done by databases\n" +
                "        </p>\n" +
                "      </div>\n" +
                "      <div class=\"row px-2\">\n" +
                "        <p align=\"justify\"><strong>How to use the page</strong><br>\n" +
                "          Use the search bar to find literature from a particular author, or from publications from a specific year! Or leave it empty to display all the papers! <br>\n" +
                "          Be sure to select the appropriate cytokine, so we know where to look!\n" +
                "        </p>\n" +
                "      </div>\n" +
                "      <div class=\"row px-2\">\n" +
                "        <p align=\"justify\">\n" +
                "          Contact us at <a href=\"mailto:cytodb@outlook.com\">cytodb@outlook.com</a> to report bugs and suggest new features!\n" +
                "        </p>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <div class=\"col-md-8 px-5\">\n" +
                "      <div class=\"card text-center my-auto\">\n" +
                "        <div class=\"card-body\">\n" +
                "          <form action=\"/results\" method=\"get\">\n" +
                "            <div class=\"form-row\">\n" +
                "              <div class=\"form-group col px-auto mt-2 mb-3\">\n" +
                "                <input name=\"search\" class=\"form-control\" type=\"search\" placeholder=\"What are you looking for?\" aria-label=\"Search\">\n" +
                "              </div>\n" +
                "\n" +
                "            </div>\n" +
                "\n" +
                "            <div class=\"form-row\">\n" +
                "              <div class=\"col px-auto\">\n" +
                "                <!-- <label for=\"exampleFormControlSelect1\">\n" +
                "                  Cytokine</label\n" +
                "                > -->\n" +
                "                <select class=\"form-control mt-2\" id=\"exampleFormControlSelect1\" name=\"filter1\">\n" +
                "                  <option selected>Select Cytokine</option>\n" +
                "                  <option>il8</option>\n" +
                "                  <option>il12</option>\n" +
                "                  <option>nphil</option>\n" +
                "                  <option>tnfavivo</option>\n" +
                "                </select>\n" +
                "              </div>\n" +
                "\n" +
                "              <div class=\"col px-auto\">\n" +
                "                <div class=\"form-group mt-2\">\n" +
                "                  <button class=\"btn form-control btn-success\" type=\"submit\" role=\"button\">Search</button>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "\n" +
                "          </form>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
    }
}
