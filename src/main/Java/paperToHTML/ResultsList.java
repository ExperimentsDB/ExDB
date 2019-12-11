package paperToHTML;

import Papers.*;

import java.util.ArrayList;
import java.util.Iterator;

public class ResultsList {
    private ArrayList<cardCreator> results;

    public ResultsList( ArrayList<Paper> results){

        this.results = new ArrayList<>();
        for (Paper result : results){
            this.results.add(new cardCreator(result));
        }

    }
      /*
    public void Search(String SearchBar, String Filter1, String Filter2){
        // TODO code to return result from database
        // TODO for (result: resultsFromDB){
               ResultDB temp = new ResultDB(String title, String author, String link, String text);
               results.add(temp);
               }

        // Example result
        results.add(new cardCreator("My Title", "me", "https://example.com", "Hello World"));
        results.add(new cardCreator(SearchBar, Filter1, "https://google.com", Filter2));


    }
    */

    public String toString(){
        StringBuilder resultsToString = new StringBuilder();
        for (cardCreator result : results){
            resultsToString.append(result.toString());
        }
        return resultsToString.toString();
    }
}
