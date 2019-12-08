package website;

import searchDB.ResultsList;

import java.util.ArrayList;
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
