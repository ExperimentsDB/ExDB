package paperToChart;

import java.util.*;

public class DatasetTemplate {
    private String dataset;

    public DatasetTemplate() {
        dataset = "";
    }
    // This takes the times and measurements for each paper and puts them in an x and y format
    public String toDatasetString(HashMap<String, String> findings, ArrayList<String> sortedTimes, int id) {
        StringBuilder datasetBuilder = new StringBuilder();
        for (String time : sortedTimes) {
            datasetBuilder.append("{x:");
            datasetBuilder.append(time);
            datasetBuilder.append(",y:");
            datasetBuilder.append(findings.get(time));
            datasetBuilder.append("},");
        }
        dataset = datasetBuilder.toString();
        dataset = dataset.substring(0, dataset.length() - 1);
        //Template for a single dataset
        String templateDataset = "{\n" +
                "            label:'EXPERIMENT',\n" +
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
        String exp = "Paper " + id;
        //Replace placeholders with results
        templateDataset = templateDataset.replace("EXPERIMENT", exp);
        templateDataset = templateDataset.replace("DATASET", dataset);

        return templateDataset;
    }

}
