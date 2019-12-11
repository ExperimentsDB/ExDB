package searchDB;


import java.util.*;

public class TimeAxis {
    String labelsJS;
    ArrayList<String> timeSet;

    public TimeAxis() {
        labelsJS = "";
        timeSet = new ArrayList<>();
    }

    public void addTimes(ArrayList<String> partialsTimes) { //to be used in iterative loop
        //Add the time values for specific experiment
        timeSet.addAll(partialsTimes);
        //sort all the current time values
        Collections.sort(timeSet);
        //transform to set and then back to arraylist as set removes duplicates
        Set<String> tempSet =  new LinkedHashSet<>();
        tempSet.addAll(timeSet);
        timeSet.clear();
        timeSet.addAll(tempSet);
    }

    public ArrayList<String> getAllTimePoints() {
        return timeSet;
    }

    public String getAxis() {
        for (String time : timeSet) {
            System.out.println(time);
            labelsJS = labelsJS + "\'" + time + "\', ";
        }
        labelsJS = labelsJS.substring(0, labelsJS.length()-2);

        return labelsJS;
    }
}
