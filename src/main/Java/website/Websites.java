package website;

import searchDB.ResultsList;

import java.util.ArrayList;
import java.util.HashMap;

public class Websites {
    private HashMap<String, String> websites;

    public Websites (){
        String index = "<html class=\"h-100\">\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\" />\n" +
                "    <meta\n" +
                "      name=\"viewport\"\n" +
                "      content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\"\n" +
                "    />\n" +
                "    <meta name=\"description\" content=\"\" />\n" +
                "    <meta name=\"author\" content=\"\" />\n" +
                "    <title>Experimental DB</title>\n" +
                "    <link\n" +
                "      rel=\"stylesheet\"\n" +
                "      href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/css/bootstrap.min.css\"\n" +
                "      integrity=\"sha384-SI27wrMjH3ZZ89r4o+fGIJtnzkAnFs3E4qz9DIYioCQ5l9Rd/7UAa8DHcaL8jkWt\"\n" +
                "      crossorigin=\"anonymous\"\n" +
                "    />\n" +
                "    <link rel=\"stylesheet\" href=\"/ExDB/style.css\">\n" +
                "  </head>\n" +
                "\n" +
                "  <body class=\"h-100\">\n" +
                "    <!-- Navbar code -->\n" +
                "    <nav class=\"navbar navbar-dark bg-dark\">\n" +
                "        <a class=\"navbar-brand\" href=\"/ExDB/\">ExDB</a>\n" +
                "        <form class=\"form-inline btn-toolbar\">\n" +
                "          <div class=\"btn-toolbar\">\n" +
                "            <a\n" +
                "              class=\"btn btn-success my-2 mx-2 my-sm-0\"\n" +
                "              href=\"/ExDB/signin\"\n" +
                "              role=\"button\"\n" +
                "              >Sign in</a\n" +
                "            >\n" +
                "            <a\n" +
                "              class=\"btn btn-success my-2 mx-2 my-sm-0\"\n" +
                "              href=\"/ExDB/register\"\n" +
                "              role=\"button\"\n" +
                "              >Register</a\n" +
                "            >\n" +
                "          </div>\n" +
                "        </form>\n" +
                "      </nav>\n" +
                "      \n" +
                "    <div class=\"container h-100\">\n" +
                "      <div class=\"row h-100 justify-content-center align-items-center\">\n" +
                "        <div class=\"col-sm-12 col-md-8 col-lg-6 mx-auto\">\n" +
                "          <div class=\"card text-center d-flex my-auto\">\n" +
                "            <div class=\"card-body\">\n" +
                "              <!-- Card for search utility -->\n" +
                "              <h2 class=\"card-title mb-3\">Experimental database</h2>\n" +
                "              <form action=\"/ExDB/results\" method=\"get\">\n" +
                "                <div class=\"form-row\">\n" +
                "                  <div class=\"form-group col px-auto mt-2 mb-3\">\n" +
                "                    <input name=\"search\" class=\"form-control\" type=\"search\" placeholder=\"What are you looking for?\" aria-label=\"Search\">\n" +
                "                  </div>\n" +
                "                  \n" +
                "                  <div class=\"form-group mx-1 px-auto mt-2 mb-3\">\n" +
                "                    <button class=\"btn btn-success\" type=\"submit\" role=\"button\">Search</button>\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "\n" +
                "                <div class=\"form-row\">\n" +
                "                  <div class=\"col px-auto\">\n" +
                "                    <label for=\"exampleFormControlSelect1\">\n" +
                "                      In vivo/In vitro</label\n" +
                "                    >\n" +
                "                    <select class=\"form-control\" id=\"exampleFormControlSelect1\" name=\"filter1\">\n" +
                "                      <option selected> - </option>\n" +
                "                      <option>In vivo</option>\n" +
                "                      <option>In vitro</option>\n" +
                "                    </select>\n" +
                "                  </div>\n" +
                "\n" +
                "                  <div class=\"col px-auto\">\n" +
                "                    <label for=\"exampleFormControlSelect2\">Live/Fixed</label>\n" +
                "                    <select class=\"form-control\" id=\"exampleFormControlSelect2\" name=\"filter2\">\n" +
                "                      <option selected> - </option>\n" +
                "                      <option>Live</option>\n" +
                "                      <option>Fixed</option>\n" +
                "                    </select>\n" +
                "                  </div>\n" +
                "                </div>\n" +
                "                <div class=\"form-row\">\n" +
                "                  <div class=\"col\"></div>\n" +
                "                  <div class=\"col\"></div>\n" +
                "                </div>\n" +
                "              </form>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>";
        websites = new HashMap<String, String>();
        websites.put("index", index);
        websites.put("results", new FileToString("results.html").toString());
        websites.put("register", new FileToString("register.html").toString());
        websites.put("signin", new FileToString("signin.html").toString());
        websites.put("stylesheets_common", new FileToString("stylesheets/common.css").toString());
    }

    public String get(String website){
        return websites.get(website);
    }

    public String getSearch(String SearchBar, String Filter1, String Filter2){
        ResultsList results = new ResultsList();
        results.Search(SearchBar, Filter1, Filter2);

        String resultsBuilder = websites.get("results").replace("RESULTS", results.toString());
        return resultsBuilder;
    }
}
