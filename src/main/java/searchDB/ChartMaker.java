/*
 This class exists to bring together all other classes
 that deal with the Javascript Chart.js element of the results.html page
 and return the text body of the resultsChart.js
 */

package searchDB;

import Papers.*;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import website.*;

public class ChartMaker {
    private String labels;
    private String datasets;

    public ChartMaker(ArrayList<Paper> papers) {
        // need to iterate result papers 2 separate times - time complexity O(n)
        // first iteration will give the actual value of different recording times in all papers. No other way to know this.
        // this iteration deals with return a string of the labels for the graph -> the recording times (e.g. 1hour, 2 hours, 4 hours etc.)
        TimeAxis timeAxis = new TimeAxis();

        for (Paper paper : papers) {
            //PaperGetTimes temp = new PaperGetTimes(paper.getTimes());
            timeAxis.addTimes(paper.getTimes());
        }
        labels = timeAxis.getAxis();

        //this iteration deals with creating each experiment's dataset and giving blank values in recording times of other experiments
        DatasetList list = new DatasetList();
        for (Paper paper : papers) {
            DatasetTemplate tempLine = new DatasetTemplate();
            list.toList(tempLine.toDatasetString(paper.getMeasurements(), paper.getTimes()));
        }
        list.datasetsMaker();
        datasets = list.datasetsMaker();
    }

    public String getLabels() {
        return labels;
    }

    public String getDatasets() { return datasets;}



}