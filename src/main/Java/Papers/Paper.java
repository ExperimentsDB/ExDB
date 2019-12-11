package Papers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.HashMap;
import java.util.Map;

public abstract class Paper {
    protected int id;
    protected String link;
    protected String figure;
    protected String author;
    protected String morphotype;
    protected String liveORfixed;
    protected String fixationmethod;
    protected String initialAFinoculum;
    protected String afumigatusstrain;
    protected String infectionmodel;
    protected String strain;
    protected String age;
    protected String treatment;
    protected String infectionroute;
    protected String sample;
    protected String sampleVolume;
    protected String sampleSize;
    protected String tUnits;
    protected HashMap<String,String> times;

    public Paper(int id, String link, String figure, String author,
                 String morphotype, String liveORfixed, String fixationmethod,
                 String initialAFinoculum, String afumigatusstrain, String infectionmodel,
                 String strain, String age, String treatment, String infectionroute, String sample,
                 String sampleVolume, String sampleSize, String tUnits, String times) throws ParseException {
        this.id = id;
        this.link = link;
        this.figure = figure;
        this.author = author;
        this.morphotype = morphotype;
        this.liveORfixed = liveORfixed;
        this.fixationmethod = fixationmethod;
        this.initialAFinoculum = initialAFinoculum;
        this.afumigatusstrain = afumigatusstrain;
        this.infectionmodel = infectionmodel;
        this.strain = strain;
        this.age = age;
        this.treatment = treatment;
        this.infectionroute = infectionroute;
        this.sample = sample;
        this.sampleVolume = sampleVolume;
        this.sampleSize = sampleSize;
        this.tUnits = tUnits;
        //'{0:125.0,24:1125.0,48:500.0,72:625.0}'
        String value = "{first_name = naresh,last_name = kumar,gender = male}";
        value = value.substring(1, value.length()-1);           //remove curly brackets
        String[] keyValuePairs = value.split(",");              //split the string to creat key-value pairs
        HashMap<String,String> map = new HashMap<>();

        for(String pair : keyValuePairs)                        //iterate over the pairs
        {
            String[] entry = pair.split(":");                   //split the pairs to get key and value
            map.put(entry[0], entry[1]);          //add them to the hashmap and trim whitespaces
        }
        this.times=map;

    }

    public int getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public String getFigure() {
        return figure;
    }

    public String getAuthor() {
        return author;
    }

    public String getMorphotype() {
        return morphotype;
    }

    public String getLiveORfixed() {
        return liveORfixed;
    }

    public String getFixationmethod() {
        return fixationmethod;
    }

    public String getInitialAFinoculum() {
        return initialAFinoculum;
    }

    public String getAfumigatusstrain() {
        return afumigatusstrain;
    }

    public String getInfectionmodel() {
        return infectionmodel;
    }

    public String getStrain() {
        return strain;
    }

    public String getAge() {
        return age;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getInfectionroute() {
        return infectionroute;
    }

    public String getSample() {
        return sample;
    }

    public String getSampleVolume() {
        return sampleVolume;
    }

    public String getSampleSize() {
        return sampleSize;
    }

    public String getUnits() {
        return tUnits;
    }

    public HashMap<String, String> getTimes() {
        return times;
    }
}

