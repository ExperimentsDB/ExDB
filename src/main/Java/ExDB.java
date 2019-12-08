import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;

import website.*;


@WebServlet(urlPatterns = {"/"}, loadOnStartup = 1)

public class ExDB extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("GET: " + req.getServletPath());

        Html2string website;
        switch (req.getServletPath()) {
            case "/style.css":
                website = new Html2string("stylesheets/common.css");
                resp.getWriter().write(website.print());
                break;
            case "/":
                website = new Html2string("index.html");
                resp.getWriter().write(website.print());
                break;
            case "/results":
                website = new Html2string("results.html");
                String search = req.getParameter("search");
                String filter1 = req.getParameter("filter1");
                String filter2 = req.getParameter("filter2");

                //TODO: MOVE
                class Result {
                    private String title;
                    private String author;
                    private String link;
                    private String text;

                    public Result(String title, String author, String link, String text) {
                        this.title = title;
                        this.author = author;
                        this.link = link;
                        this.text = text;
                    }

                    @Override
                    public String toString() {
                        String template = "<div class=\"col-12 d-flex my-2\">\n" +
                                "            <a href=\"LINK\" >" +
                                "              <div class=\"card w-100\">\n" +
                                "                <div class=\"card-body\">\n" +
                                "                    <h5 class=\"card-title\">TITLE</h5>\n" +
                                "                    <p class=\"card-text\"><strong>AUTHOR</strong></p>\n" +
                                "                    <p class=\"card-text\">TEXT</a>\n" +
                                "                </div>\n" +
                                "              </div>\n" +
                                "            </a>" +
                                "        </div>";
                        template = template.replace("LINK", this.link);
                        template = template.replace("TITLE", this.title);
                        template = template.replace("AUTHOR", this.author);
                        template = template.replace("TEXT", this.text);
                        return template;
                    }
                }

                // TODO: ArrayList<Result> results = SearchDB(search, filter1, filter2)
                ArrayList<Result> results = new ArrayList();
                results.add(new Result("My Title", "me", "https://example.com", "Hello World"));
                results.add(new Result("My Title", "me", "https://example.com", "Hello World"));


                StringBuilder resultsToString = new StringBuilder();
                for (Result result : results) {
                    resultsToString.append(result);
                }
                String page = website.print().replace("RESULTS", resultsToString.toString());
                resp.getWriter().write(page);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST: " + req.getServletPath());


    }
}
