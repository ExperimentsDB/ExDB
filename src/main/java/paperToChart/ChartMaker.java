/*
 This class exists to bring together all other classes
 that deal with the Javascript Chart.js element of the results.html page
 and return the text body of the resultsChart.js
 */

package paperToChart;

import papers.*;

import java.util.ArrayList;

public class ChartMaker {
    private String datasets;

    public ChartMaker(ArrayList<Paper> papers) {
        //creates each experiment's dataset and puts them into a JavaScript format for the Chart
        DatasetList list = new DatasetList();
        for (Paper paper : papers) {
            DatasetTemplate tempLine = new DatasetTemplate();
            list.toList(tempLine.toDatasetString(paper.getMeasurements(), paper.getTimes(), paper.getId()));
        }
        list.datasetsMaker();
        datasets = list.datasetsMaker();
    }

    public String getDatasets() { return datasets;}
}