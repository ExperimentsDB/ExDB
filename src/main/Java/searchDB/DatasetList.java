package searchDB;

import website.FileToString;

import java.util.ArrayList;
import java.util.Iterator;

public class DatasetList {
    public ArrayList<String> allDatasets;

    public DatasetList() {
        allDatasets = new ArrayList<>();
    }

    public void toList(String datasetOfLine) {
        allDatasets.add(datasetOfLine);
    }

    public String datasetsMaker() {
        Iterator i = allDatasets.iterator();
        String datasets = "";
        while (i.hasNext()) {
            datasets = datasets + i.next();
        }
        datasets = datasets.substring(0, datasets.length()-2);

        return datasets;
    }

}