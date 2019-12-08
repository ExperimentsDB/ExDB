import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;

import searchDB.ResultsList;
import website.*;


@WebServlet(urlPatterns = {"/"}, loadOnStartup = 1)

public class ExDB extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("GET: " + req.getServletPath());

        FileToString website;
        switch (req.getServletPath()) {
            case "/style.css":
                website = new FileToString("stylesheets/common.css");
                resp.getWriter().write(website.print());
                break;
            case "/":
                website = new FileToString("index.html");
                resp.getWriter().write(website.print());
                break;
            case "/results":
                website = new FileToString("results.html");
                String search = req.getParameter("search");
                String filter1 = req.getParameter("filter1");
                String filter2 = req.getParameter("filter2");

                ResultsList results = new ResultsList();
                results.Search(search, filter1, filter2);


                String page = website.print().replace("RESULTS", results.toString());
                resp.getWriter().write(page);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST: " + req.getServletPath());


    }
}
