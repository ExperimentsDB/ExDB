package searchDB;

import org.json.simple.JSONObject;
import website.FileToString;

import java.util.*;

public class DatasetTemplate {
    private String dataset;

    public DatasetTemplate() {
        dataset = "";
    }

    public String toDatasetString(JSONObject findings, ArrayList<String> sortedTimes) {
        Iterator i = sortedTimes.iterator();
        while(i.hasNext()) {
            if (findings.containsKey(i.next())) {
                dataset = dataset + findings.get(i.next()) + ", ";
            }
            else if (!findings.containsKey(i.next())) {
                dataset = dataset + ", ";
            }
        }
        dataset = dataset.substring(0, dataset.length()-2);

        String templateDataset = new FileToString("scripts/datasetJS.txt").toString();
        templateDataset = templateDataset.replace("DATASET", dataset);

        return templateDataset;
    }

}
