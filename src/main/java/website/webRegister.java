package website;

public class webRegister extends webHtml {
    // Register page
    public webRegister(){
        html = "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\" />\n" +
                "    <meta\n" +
                "      name=\"viewport\"\n" +
                "      content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\"\n" +
                "    />\n" +
                "    <meta name=\"description\" content=\"\" />\n" +
                "    <meta name=\"author\" content=\"\" />\n" +
                "    <title>Experimental DB - Register</title>\n" +
                "    <link\n" +
                "      rel=\"stylesheet\"\n" +
                "      href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/css/bootstrap.min.css\"\n" +
                "      integrity=\"sha384-SI27wrMjH3ZZ89r4o+fGIJtnzkAnFs3E4qz9DIYioCQ5l9Rd/7UAa8DHcaL8jkWt\"\n" +
                "      crossorigin=\"anonymous\"\n" +
                "    />\n" +
                "    <link rel=\"stylesheet\" href=\"stylesheets/common.css\" />\n" +
                "  </head>\n" +
                "\n" +
                "  <body>\n" +
                "    <!-- Navbar code -->\n" +
                "    <nav class=\"navbar fixed-top navbar-dark bg-dark\">\n" +
                "        <a class=\"navbar-brand\" href=\"/\">ExDB</a>\n" +
                "        <form class=\"form-inline btn-toolbar\">\n" +
                "          <div class=\"btn-toolbar\">\n" +
                "            <a\n" +
                "              class=\"btn btn-success my-2 mx-2 my-sm-0\"\n" +
                "              href=\"/signin\"\n" +
                "              role=\"button\"\n" +
                "              >Sign in</a\n" +
                "            >\n" +
                "            <a\n" +
                "              class=\"btn btn-success my-2 mx-2 my-sm-0\"\n" +
                "              href=\"/register\"\n" +
                "              role=\"button\"\n" +
                "              >Register</a\n" +
                "            >\n" +
                "          </div>\n" +
                "        </form>\n" +
                "      </nav>\n" +
                "  \n" +
                "      <div class=\"container h-100\">\n" +
                "        <div class=\"row h-100 justify-content-center align-items-center\">\n" +
                "          <div class=\"col-sm-12 col-md-8 col-lg-6 mx-auto pt-5 mt-5\">\n" +
                "            <div class=\"card text-center d-flex my-auto\">\n" +
                "              <div class=\"card-body\">\n" +
                "                <!--Card for register utility-->\n" +
                "                <h2 class=\"card-title mb-3\"><strong>Coming soon:</strong> Register here!</h2>\n" +
                "                <p class=\"card-text\">\n" +
                "                  Already have an account?\n" +
                "                  <a href=\"/signin\"\n" +
                "                  >Sign in here!</a>\n" +
                "                </p>\n" +
                "                <form action=\"\">\n" +
                "                    <div class=\"form-group\">\n" +
                "                      <label for=\"fullName\">Enter your full name</label>\n" +
                "                      <input type=\"name\" class=\"form-control\"  placeholder=\"Full name\">\n" +
                "                    </div>\n" +
                "          \n" +
                "                    <div class=\"form-group\">\n" +
                "                        <label for=\"title\">Title</label>\n" +
                "                        <select class=\"form-control\" id=\"exampleFormControlSelect1\">\n" +
                "                          <option>Prof</option>\n" +
                "                          <option>Dr</option>\n" +
                "                          <option>Researcher</option>\n" +
                "                          <option>Student</option>\n" +
                "                        </select>\n" +
                "                      </div>\n" +
                "          \n" +
                "                    <div class=\"form-group\">\n" +
                "                      <label for=\"organisation\">Organisation</label>\n" +
                "                      <input type=\"username\" class=\"form-control\"  placeholder=\"Enter name of organisation\">\n" +
                "                    </div>\n" +
                "          \n" +
                "                    <div class=\"form-group\">\n" +
                "                      <label for=\"exampleInputPassword1\">Password</label>\n" +
                "                      <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n" +
                "                    </div>\n" +
                "\n" +
                "                    <div class=\"form-group\">\n" +
                "                        <label for=\"exampleInputPassword2\">Confirm password</label>\n" +
                "                        <input \n" +
                "                          type=\"password\" \n" +
                "                          class=\"form-control\" \n" +
                "                          id=\"exampleInputPassword2\" \n" +
                "                          placeholder=\"Re-enter password\">\n" +
                "                      </div>\n" +
                "          \n" +
                "                    <button type=\"submit\" class=\"btn btn-success btn-block \">Register</button>\n" +
                "                   </form>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "          \n" +
                "    </body>\n" +
                "</html>";
    }
}
