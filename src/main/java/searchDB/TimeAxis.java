package searchDB;
import java.util.*;

public class TimeAxis {
    String labelsJS;
    ArrayList<String> timeSet;

    public TimeAxis() {
        labelsJS = "";
        timeSet = new ArrayList<>();
    }

    public static void main(String[] args) {
        TimeAxis a = new TimeAxis();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("20");
        strings.add("10");
        strings.add("5");
        strings.add("5");
        a.addTimes(strings);
    }

    public void addTimes(ArrayList<String> partialsTimes) { //to be used in iterative loop
        //Add the time values for specific experiment
        //sort all the current time values
        //transform to set and then back to arraylist as set removes duplicates
        Set<String> tempSet = new HashSet<>(timeSet);
        tempSet.addAll(partialsTimes);
        timeSet = new ArrayList<>(tempSet);
        timeSet.sort(Comparator.comparing(Integer::valueOf));
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
