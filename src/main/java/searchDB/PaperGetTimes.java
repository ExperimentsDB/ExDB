package searchDB;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PaperGetTimes {
    private ArrayList<String> timePoints;

    public PaperGetTimes(HashMap<String, String> map) {
        timePoints = new ArrayList<>();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            timePoints.add(key.trim());
        }
    }


    public ArrayList<String> getItsTimePoints() {
        return timePoints;
    }
}