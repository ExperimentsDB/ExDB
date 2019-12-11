package searchDB;


import java.util.*;

public class TimeAxis {
    String labelsJS;
    ArrayList<String> timeSet;

    public TimeAxis() {
        labelsJS = "";
        timeSet = new ArrayList<>();
    }

    public void addTimes(ArrayList<String> partialsTimes) {
        timeSet.addAll(partialsTimes);
        Collections.sort(timeSet);
        Set<String> tempSet =  new LinkedHashSet<>();
        tempSet.addAll(timeSet);
        timeSet.clear();
        timeSet.addAll(tempSet);
    }

    public ArrayList<String> getAllTimes() {
        return timeSet;
    }

    public void makeAxis(ArrayList<String> sortedTimes) {
        Iterator i = sortedTimes.iterator();
        while (i.hasNext()) {
            labelsJS = labelsJS + "\'" + i.next() + "\', ";
        }
        labelsJS = labelsJS.substring(0, labelsJS.length()-2);
    }

    public String getAxis() {
        return labelsJS;
    }
}
