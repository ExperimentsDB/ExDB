package website;

import paperToHTML.ResultsList;
import searchDB.ChartMaker;

import java.util.HashMap;

public class Websites {
    private HashMap<String, String> websites;

    public Websites (){
        websites = new HashMap<String, String>();
        websites.put("index", new FileToString("index.html").toString());
        websites.put("results", new FileToString("results.html").toString());
        websites.put("register", new FileToString("register.html").toString());
        websites.put("signin", new FileToString("signin.html").toString());
        websites.put("stylesheets_common", new FileToString("stylesheets/common.css").toString());
        websites.put("scripts_resultsChart", new FileToString("scripts/resultsChart.js").toString());
    }

    public String get(String website){
        return websites.get(website);
    }

    public String getSearch(String SearchBar, String Filter1, String Filter2){
        //TODO: Maybe make class of SearchDB and perform the search?

        ResultsList cardResults = new ResultsList(Searchdb(SearchBar, Filter1));
        ChartMaker chart = new ChartMaker(Searchdb(SearchBar, Filter1));
        websites.get("scripts_resultsChart").replace("TIMELABELS", chart.getLabels());
        websites.get("scripts_resultsChart").replace("DATASETS", chart.getDatasets());

        String resultsBuilder = websites.get("results").replace("RESULTS", cardResults.toString());
        return resultsBuilder;
    }
}
