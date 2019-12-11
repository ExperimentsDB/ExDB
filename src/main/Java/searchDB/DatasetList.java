package searchDB;

import java.util.ArrayList;
import java.util.Iterator;

public class DatasetList {
    public ArrayList<String> allDatasets;

    public DatasetList() {
        allDatasets = new ArrayList<>();
    }

    //will be used in an iterative block to parse each line's data in Array
    public void toList(String datasetOfLine) {
        allDatasets.add(datasetOfLine);
    }

    //Combines all the blocks of JavaScript text for each line's data
    public String datasetsMaker() {
        Iterator i = allDatasets.iterator();
        String datasets = "";
        while (i.hasNext()) {
            datasets = datasets + i.next() + ",";
        }
        datasets = datasets.substring(0, datasets.length()-1);

        return datasets;
    }

}