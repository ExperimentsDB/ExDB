package paperToHTML;

import papers.*;

import java.util.ArrayList;

// Class for storing all result cards
public class ResultsList {
    private ArrayList<CardCreator> results;

    public ResultsList( ArrayList<Paper> results){
        // Iterates through the list of papers and creates and stores a card for each result
        this.results = new ArrayList<>();
        for (Paper result : results){
            this.results.add(new CardCreator(result));
        }
    }

    // Function to access results
    public String toString(){
        // Creates a string of HTML of the results
        StringBuilder resultsToString = new StringBuilder();
        for (CardCreator result : results){
            resultsToString.append(result.toString());
        }
        return resultsToString.toString();
    }
}
