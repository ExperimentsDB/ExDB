package searchDB;

import java.util.ArrayList;

public class ResultsList {
    private ArrayList<ResultDB> results;

    public ResultsList(){
        results = new ArrayList<ResultDB>();
    }

    public void Search(String SearchBar, String Filter1, String Filter2){
        // TODO code to return result from database
        /* TODO for (result: resultsFromDB){
               ResultDB temp = new ResultDB(String title, String author, String link, String text);
               results.add(temp);
               }
        */
        // Example result
        results.add(new ResultDB("My Title", "me", "https://example.com", "Hello World"));
        results.add(new ResultDB(SearchBar, Filter1, "https://google.com", Filter2));


    }

    public String toString(){
        StringBuilder resultsToString = new StringBuilder();
        for (ResultDB result : results){
            resultsToString.append(result.toString());
        }
        return resultsToString.toString();
    }
}
