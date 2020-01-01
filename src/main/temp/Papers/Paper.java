package Papers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.HashMap;

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
    protected ArrayList<String> times;
    protected HashMap<String, String> measurements;


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
        times = times.substring(1, times.length()-1);
        String[] keyValuePairs = times.split(",");
        this.measurements = new HashMap<String, String>();
        this.times = new ArrayList<>();
        for(String valuePair : keyValuePairs) {
            String[] entry = valuePair.split(":");
            this.times.add(entry[0]);
            this.measurements.put(entry[0], entry[1]);
        }

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

    public HashMap<String, String> getMeasurements() {
        return measurements;
    }

    public ArrayList<String> getTimes() {return times;}
}

