package searchDB;

import org.json.simple.JSONObject;
import website.FileToString;

import java.util.*;

public class DatasetTemplate {
    private String dataset;

    public DatasetTemplate() {
        dataset = "";
    }

    public String toDatasetString(HashMap<String,String> findings, ArrayList<String> sortedTimes) {
//        Iterator i = sortedTimes.iterator();
//        while(i.hasNext()) {
//            if (findings.containsKey(i.next())) {
//                dataset = dataset + findings.get(i.next()) + ", ";
//            }
//            else if (!findings.containsKey(i.next())) {
//                dataset = dataset + ", ";
//            }
//        }
        StringBuilder datasetBuilder = new StringBuilder();
        for (String time : sortedTimes){
            if (findings.containsKey(time)){
                datasetBuilder.append(findings.get(time));
                datasetBuilder.append(",");
            }
            else
            {
                datasetBuilder.append(",");
            }
        }
        dataset = datasetBuilder.toString();
        dataset = dataset.substring(0, dataset.length()-1);

        //String templateDataset = new FileToString("scripts/datasetJS.txt").toString();
        String templateDataset = "{\n" +
                "            label:'Experiment 1',\n" +
                "            data:[\n" +
                "                DATASET\n" +
                "\n" +
                "            ],\n" +
                "            //backgroundColor = 'green'\n" +
                "            borderColor:[\n" +
                "                'rgba(255, 99, 50, 0.6)'\n" +
                "            ],\n" +
                "            borderWidth:1,\n" +
                "            borderPointColor:'#777',\n" +
                "            hoverBorderWidth:2,\n" +
                "            pointHoverBorderColor:'#444',\n" +
                "            spanGaps:true,\n" +
                "            lineTension: 0,\n" +
                "            fill: false\n" +
                "        }";
        templateDataset = templateDataset.replace("DATASET", dataset);

        return templateDataset;
    }

}
