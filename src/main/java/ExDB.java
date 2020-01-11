import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

import website.*;


@WebServlet(urlPatterns = {"/"}, loadOnStartup = 1)

public class ExDB extends HttpServlet {
    @Override
    // Switch statement only in doGet as doPost id not used
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("GET: " + req.getServletPath());

        Websites websites = new Websites();
        // Changing URLs
        switch (req.getServletPath()) {
            // Used for general styling
            case "/style.css":
                resp.getWriter().write(websites.get("stylesheets_common"));
                break;
            // Homepage of website
            case "/":
                resp.getWriter().write(websites.get("index"));
                break;
            // Template used for creating the chart for results
            case "/script.js":
                resp.getWriter().write(websites.get("scripts_resultsChartTemplate"));
                break;
            case "/results":
                // Takes the parameters to use in search function
                String search = req.getParameter("search");
                String filter1 = req.getParameter("filter1");
                String filter2 = req.getParameter("filter2");
                // Search function to search through database
                resp.getWriter().write(websites.getSearch(search, filter1, filter2));
                break;
            case "/signin":
                resp.getWriter().write(websites.get("signin"));
                break;
            case "/register":
                resp.getWriter().write(websites.get("register"));
                break;
            default:
                // Error check for URL not found
                resp.getWriter().write("404");

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST: " + req.getServletPath());
    }
}
