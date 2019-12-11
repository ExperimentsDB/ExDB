package website;

import paperToHTML.ResultsList;
import searchDB.ChartMaker;
import Papers.*;
import searchDB.SearchDB;

import java.sql.SQLException;
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
                "                      <option selected>il8</option>\n" +
                "                      <option>il12</option>\n" +
                "                      <option>nphil</option>\n" +
                "                      <option>tnfavivo</option>\n" +
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
        websites.put("scripts_resultsChartTemplate", "let myChart1 = document.getElementById('myChart1').getContext('2d');\n" +
                "\n" +
                "Chart.defaults.global.defaultFontFamily = 'Lato';\n" +
                "Chart.defaults.global.defaultFontSize = 12;\n" +
                "Chart.defaults.global.defaultFontColor = '#777';\n" +
                "\n" +
                "\n" +
                "let resultsunit1 = new Chart(myChart1, {\n" +
                "    type:'line', //bar, horizontalBar, line, doughnut, radar, polar Area\n" +
                "    data: {\n" +
                "        labels:['1h', '2h', '3h', '4h', '5h', '6h'],\n" +
                "        datasets:[\n" +
                "            DATASETS\n" +
                "        ]\n" +
                "    },\n" +
                "    options:{\n" +
                "        title:{\n" +
                "            display: true,\n" +
                "            text: 'Testing multiple lines',\n" +
                "            fontSize: 25\n" +
                "        },\n" +
                "        legend: {\n" +
                "            display:false,\n" +
                "            position:'right',\n" +
                "            labels: {\n" +
                "                fontColor:'#000'\n" +
                "            }\n" +
                "        },\n" +
                "        layout:{\n" +
                "            padding:{\n" +
                "                left:0,\n" +
                "                right:0,\n" +
                "                bottom:0,\n" +
                "                top:0\n" +
                "            }\n" +
                "        },\n" +
                "        tooltips:{\n" +
                "            enabled:true\n" +
                "        }\n" +
                "    }\n" +
                "});");
        websites.put("sample", "<html class=\"h-100\">\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\"/>\n" +
                "    <meta\n" +
                "            name=\"viewport\"\n" +
                "            content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\"\n" +
                "    />\n" +
                "    <meta name=\"description\" content=\"\"/>\n" +
                "    <meta name=\"author\" content=\"\"/>\n" +
                "    <title>Experimental DB</title>\n" +
                "    <link\n" +
                "            rel=\"stylesheet\"\n" +
                "            href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/css/bootstrap.min.css\"\n" +
                "            integrity=\"sha384-SI27wrMjH3ZZ89r4o+fGIJtnzkAnFs3E4qz9DIYioCQ5l9Rd/7UAa8DHcaL8jkWt\"\n" +
                "            crossorigin=\"anonymous\"\n" +
                "    />\n" +
                "    <link rel=\"stylesheet\" href=\"stylesheets/common.css\">\n" +
                "    <script\n" +
                "            src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js\"\n" +
                "    >\n" +
                "    </script>\n" +
                "\n" +
                "</head>\n" +
                "\n" +
                "<body class=\"h-100\">\n" +
                "<!-- Navbar code -->\n" +
                "<nav class=\"navbar  navbar-dark bg-dark\">\n" +
                "    <a class=\"navbar-brand\" href=\"/\">ExDB</a>\n" +
                "    <form class=\"form-inline btn-toolbar\">\n" +
                "        <div class=\"btn-toolbar\">\n" +
                "            <a\n" +
                "                    class=\"btn btn-success my-2 mx-2 my-sm-0\"\n" +
                "                    href=\"/signin\"\n" +
                "                    role=\"button\"\n" +
                "            >Sign in</a\n" +
                "            >\n" +
                "            <a\n" +
                "                    class=\"btn btn-success my-2 mx-2 my-sm-0\"\n" +
                "                    href=\"/register\"\n" +
                "                    role=\"button\"\n" +
                "            >Register</a\n" +
                "            >\n" +
                "        </div>\n" +
                "    </form>\n" +
                "</nav>\n" +
                "\n" +
                "<div class=\"container h-100\">\n" +
                "    <div class=\"row \">\n" +
                "\n" +
                "        <div class=\"col-12 mt-2\">\n" +
                "            <div class=\"card text-center d-flex\">\n" +
                "                <div class=\"card-body\">\n" +
                "                    <!-- Card for search utility -->\n" +
                "                    <form action=\"/results\" method=\"get\">\n" +
                "\n" +
                "                        <div class=\"form-row\">\n" +
                "                            <div class=\"col px-auto\">\n" +
                "                                <label for=\"tableFilter\">\n" +
                "                                    Cytokine type\n" +
                "                                </label>\n" +
                "                                <select class=\"form-control\" id=\"tableFilter\" name=\"table\">\n" +
                "                                    <option selected>il8</option>\n" +
                "                                    <option>il12</option>\n" +
                "                                    <option>nphil</option>\n" +
                "                                    <option>tnfavivo</option>\n" +
                "                                </select>\n" +
                "                            </div>\n" +
                "\n" +
                "                            <div class=\"col px-auto\">\n" +
                "                                <label for=\"vivovitroFilter\">In vivo/In vitro</label>\n" +
                "                                <select class=\"form-control\" id=\"vivovitroFilter\" name=\"vivovitro\">\n" +
                "                                    <option selected>In vivo</option>\n" +
                "                                    <option>In vitro</option>\n" +
                "                                </select>\n" +
                "                            </div>\n" +
                "\n" +
                "                            <div class=\"col\">\n" +
                "                                <button class=\"btn btn-success\" type=\"submit\" role=\"button\">Search</button>\n" +
                "                            </div>\n" +
                "\n" +
                "                        </div>\n" +
                "\n" +
                "                    </form>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"col-sm-12 col-lg-6\">\n" +
                "            <div class=\"row\"><canvas id=\"myChart1\"></canvas></div>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"col-sm-12 col-md-6 col-lg-6\">\n" +
                "\n" +
                "            <div class=\"card w-100 mt-2\">\n" +
                "                <div class=\"card-body\">\n" +
                "                    <h5 class=\"card-title\">Research Paper Result 2</h5>\n" +
                "                    <p class=\"card-text\"><strong>[Authors and publication date]</strong></p>\n" +
                "                    <p class=\"card-text\">Link to paper and more information</a>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "\n" +
                "            <div class=\"card w-100 mt-2\">\n" +
                "                <div class=\"card-body\">\n" +
                "                    <h5 class=\"card-title\">Research Paper Result 2</h5>\n" +
                "                    <p class=\"card-text\"><strong>[Authors and publication date]</strong></p>\n" +
                "                    <p class=\"card-text\">Link to paper and more information</a>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "\n" +
                "        </div>\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "<script>SCRIPT</script>\n" +
                "</body>\n" +
                "</html>");
    }

    public String get(String website){
        return websites.get(website);
    }

    public String getSearch(String SearchBar, String Filter1, String Filter2) throws SQLException {
        SearchDB search = new SearchDB();
        ResultsList cardResults = new ResultsList(search.Searchdb(SearchBar, Filter1));
        ChartMaker chart = new ChartMaker(search.Searchdb(SearchBar, Filter1));

        String chartBuilder = "";
        chartBuilder = websites.get("scripts_resultsChartTemplate").replace("TIMELABELS", chart.getLabels());
        chartBuilder = chartBuilder.replace("DATASETS", chart.getDatasets());
        websites.put("scripts_resultsChart", chartBuilder);

        String resultsBuilder = websites.get("results").replace("RESULTS", cardResults.toString());
        resultsBuilder = resultsBuilder.replace("SCRIPT", chartBuilder);
        System.out.println(resultsBuilder);
        return resultsBuilder;
    }
}
