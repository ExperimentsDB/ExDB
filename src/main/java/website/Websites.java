package website;

import paperToHTML.ResultsList;
import searchDB.ChartMaker;
import searchDB.SearchDB;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.HashMap;

// Class for storing the HTML of the websites.
// Includes function for searching for results in the database
public class Websites {
    private HashMap<String, webHtml> websites;

    public Websites (){
        // each website mapped to an id
        websites = new HashMap<>();
        websites.put("index", new webIndex());
        websites.put("results", new webResults());
        websites.put("register", new webRegister());
        websites.put("signin", new webSignin());
        websites.put("result", new webResult());
        websites.put("stylesheets_common", new webStylesheetCommon());
        websites.put("scripts_resultsChartTemplate", new webResultsChartTemplate());
    }

    // Function to access websites HashMap
    public String get(String website){
        return websites.get(website).toString();
    }

    // Function to search the database. Takes parameters from website URL
    public String getSearch(String SearchBar, String Filter1, String Filter2) {
        try {
            // Class for searching database
            SearchDB search = new SearchDB();

            // Creates a list of results in html using the SearchDB class and function
            ResultsList cardResults = new ResultsList(search.Searchdb(SearchBar, Filter1));
            // Class for creating javascript chart using SearchDB class and function
            ChartMaker chart = new ChartMaker(search.Searchdb(SearchBar, Filter1));

            // String for modifying chart template to include time axis and datasets from ChartMAker class.
            String chartBuilder = "";
            chartBuilder = websites.get("scripts_resultsChartTemplate").toString().replace("TIMELABELS", chart.getLabels());
            chartBuilder = chartBuilder.replace("DATASETS", chart.getDatasets());

            // String for modyfing results html to add the results from ResultsList and the chart from chartBuilder
            String resultsBuilder = websites.get("results").toString().replace("RESULTS", cardResults.toString());
            resultsBuilder = resultsBuilder.replace("SCRIPT", chartBuilder);

            // Closes connection to database
            search.closeConn();

            return resultsBuilder;
        } catch (SQLException | URISyntaxException e) {
            // Prints if there is a problem with the database
            System.out.println(e);
            return "502 Server error";
        }
    }
}
