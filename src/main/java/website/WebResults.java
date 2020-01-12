package website;

public class WebResults extends WebHtml {
    public WebResults(){
        // Results page
        html = "<html class=\"h-100\">\n" +
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
                "                            <div class=\"form-group col px-auto mt-2 mb-3\">\n" +
                "                                <input name=\"search\" class=\"form-control\" type=\"search\" placeholder=\"What are you looking for?\" aria-label=\"Search\">\n" +
                "                            </div>\n" +
                "\n" +
                "                        </div>\n" +
                "\n" +
                "                        <div class=\"form-row\">\n" +
                "                            <div class=\"col px-auto\">\n" +
                "                                <!-- <label for=\"exampleFormControlSelect1\">\n" +
                "                                  Cytokine</label\n" +
                "                                > -->\n" +
                "                                <select class=\"form-control mt-2\" id=\"exampleFormControlSelect1\" name=\"filter1\">\n" +
                "                                    <option selected>Select Cytokine</option>\n" +
                "                                    <option>il8</option>\n" +
                "                                    <option>il12</option>\n" +
                "                                    <option>nphil</option>\n" +
                "                                    <option>tnfavivo</option>\n" +
                "                                </select>\n" +
                "                            </div>\n" +
                "\n" +
                "                            <div class=\"col px-auto\">\n" +
                "                                <div class=\"form-group mt-2\">\n" +
                "                                    <button class=\"btn form-control btn-success\" type=\"submit\" disabled id=\"submitButton\" role=\"button\">Search</button>\n" +
                "                                </div>\n" +
                "                            </div>\n" +
                "                            <script>\n" +
                "                               let selection = document.getElementById(\"exampleFormControlSelect1\");\n" +
                "                               let button = document.getElementById(\"submitButton\");\n" +
                "                               selection.addEventListener('change', () => {\n" +
                "                                  if (selection.selectedIndex === 0) {\n" +
                "                                     button.disabled = true;\n" +
                "                                  } else {\n" +
                "                                     console.log(button)\n" +
                "                                     button.disabled = false;\n" +
                "                                  }\n" +
                "                               }) \n" +
                "                            </script>\n" +
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
                "            RESULTS\n" +
                "\n" +
                "        </div>\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "<script>SCRIPT</script>\n" +
                "</body>\n" +
                "</html>";
    }
}
