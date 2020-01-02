package Papers;

import org.json.simple.parser.ParseException;

// IL12 table papers
public class IL12 extends Paper {
    private String cellconcentration;
    private String analysis;
    public IL12(int id, String link, String figure, String author,
                String morphotype, String liveORfixed, String fixationmethod,
                String initialAFinoculum, String afumigatusstrain,
                String infectionmodel, String strain, String age,
                String treatment, String infectionroute, String sample,
                String sampleVolume, String sampleSize, String tUnits,
                String times, String cellconcentration, String analysis) throws ParseException {
        super(id, link, figure, author, morphotype, liveORfixed, fixationmethod,
                initialAFinoculum, afumigatusstrain, infectionmodel,
                strain, age, treatment, infectionroute, sample,
                sampleVolume, sampleSize, tUnits, times);
        this.cellconcentration=cellconcentration;
        this.analysis=analysis;
    }

    public String getCellconcentration() {
        return cellconcentration;
    }

    public String getAnalysis() {
        return analysis;
    }
}
