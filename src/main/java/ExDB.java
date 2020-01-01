import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.SQLException;

import website.*;


@WebServlet(urlPatterns = {"/"}, loadOnStartup = 1)

public class ExDB extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("GET: " + req.getServletPath());

        Websites websites = new Websites();
        // Changing URLs
        switch (req.getServletPath()) {
            case "/style.css":
                resp.getWriter().write(websites.get("stylesheets_common"));
                break;
            case "/":
                resp.getWriter().write(websites.get("index"));
                break;
            case "/script.js":
                resp.getWriter().write(websites.get("scripts_resultsChartTemplate"));
                break;
            case "/results":
                String search = req.getParameter("search");
                String filter1 = req.getParameter("filter1");
                String filter2 = req.getParameter("filter2");

                try {
                    resp.getWriter().write(websites.getSearch(search, filter1, filter2));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "/signin":
                resp.getWriter().write(websites.get("signin"));
                break;
            case "/register":
                resp.getWriter().write(websites.get("register"));
                break;
            default:
                resp.getWriter().write("404");

        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST: " + req.getServletPath());


    }
}
