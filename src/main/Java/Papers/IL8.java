package Papers;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class IL8 extends Paper {

    public IL8(int id, String link, String figure,
               String author, String morphotype,
               String liveORfixed, String fixationmethod,
               String initialAFinoculum, String afumigatusstrain,
               String infectionmodel, String strain, String age,
               String treatment, String infectionroute, String sample,
               String sampleVolume, String sampleSize, String tUnits,
               String times) throws ParseException {
        super(id, link, figure, author, morphotype, liveORfixed, fixationmethod,
                initialAFinoculum, afumigatusstrain, infectionmodel, strain, age,
                treatment, infectionroute, sample, sampleVolume, sampleSize, tUnits, times);

    }

}
