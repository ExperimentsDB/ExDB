package testPapers;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import papers.*;

import java.util.ArrayList;
import java.util.HashMap;

public class testPaper {
    // Tetsts that the parameters of the papers are passed in and accessed correctly for all paper types
    @Test
    public void testIL8Parameters() throws ParseException {
        IL8 testIL8 = new IL8(1, "www.example.com", "testFigure",
                                "testAuthor", "testMorphotype", "testLiveOrFixed",
                                "testFixationMethod", "testInitialAFinoculum", "testAlumiatusstrain",
                                "testInfectionmodel", "testStrain", "testAge",
                                "testTreatment", "testInfectionroute", "testSample",
                                "testSampleVolume", "testSampleSize", "testTUnits",
                                ",1:test1,2:test2,3:test3,4:test4,5:test5,");

        // Manually creates times and measurements to check against Paper functions
        ArrayList<String> testTimes = new ArrayList<>();
        testTimes.add("1");
        testTimes.add("2");
        testTimes.add("3");
        testTimes.add("4");
        testTimes.add("5");
        HashMap<String,String> testMeasurements = new HashMap<>();
        testMeasurements.put("1","test1");
        testMeasurements.put("2","test2");
        testMeasurements.put("3","test3");
        testMeasurements.put("4","test4");
        testMeasurements.put("5","test5");

        Assert.assertEquals(testIL8.getId(),1);
        Assert.assertEquals(testIL8.getLink(),"www.example.com");
        Assert.assertEquals(testIL8.getFigure(),"testFigure");
        Assert.assertEquals(testIL8.getAuthor(),"testAuthor");
        Assert.assertEquals(testIL8.getMorphotype(),"testMorphotype");
        Assert.assertEquals(testIL8.getLiveORfixed(),"testLiveOrFixed");
        Assert.assertEquals(testIL8.getFixationmethod(),"testFixationMethod");
        Assert.assertEquals(testIL8.getInitialAFinoculum(),"testInitialAFinoculum");
        Assert.assertEquals(testIL8.getAfumigatusstrain(),"testAlumiatusstrain");
        Assert.assertEquals(testIL8.getInfectionmodel(),"testInfectionmodel");
        Assert.assertEquals(testIL8.getStrain(),"testStrain");
        Assert.assertEquals(testIL8.getAge(),"testAge");
        Assert.assertEquals(testIL8.getTreatment(),"testTreatment");
        Assert.assertEquals(testIL8.getInfectionroute(),"testInfectionroute");
        Assert.assertEquals(testIL8.getSample(),"testSample");
        Assert.assertEquals(testIL8.getSampleVolume(),"testSampleVolume");
        Assert.assertEquals(testIL8.getSampleSize(),"testSampleSize");
        Assert.assertEquals(testIL8.getUnits(),"testTUnits");
        Assert.assertEquals(testIL8.getMeasurements(),testMeasurements);
        Assert.assertEquals(testIL8.getTimes(),testTimes);
    }
    @Test
    public void testIL12Parameters() throws ParseException {
        IL12 testIL12 = new IL12(1, "www.example.com", "testFigure",
                "testAuthor", "testMorphotype", "testLiveOrFixed",
                "testFixationMethod", "testInitialAFinoculum", "testAlumiatusstrain",
                "testInfectionmodel", "testStrain", "testAge",
                "testTreatment", "testInfectionroute", "testSample",
                "testSampleVolume", "testSampleSize", "testTUnits",
                ",1:test1,2:test2,3:test3,4:test4,5:test5,",
                "testCellConcentration", "testAnalysis");

        ArrayList<String> testTimes = new ArrayList<>();
        testTimes.add("1");
        testTimes.add("2");
        testTimes.add("3");
        testTimes.add("4");
        testTimes.add("5");
        HashMap<String,String> testMeasurements = new HashMap<>();
        testMeasurements.put("1","test1");
        testMeasurements.put("2","test2");
        testMeasurements.put("3","test3");
        testMeasurements.put("4","test4");
        testMeasurements.put("5","test5");

        Assert.assertEquals(testIL12.getId(),1);
        Assert.assertEquals(testIL12.getLink(),"www.example.com");
        Assert.assertEquals(testIL12.getFigure(),"testFigure");
        Assert.assertEquals(testIL12.getAuthor(),"testAuthor");
        Assert.assertEquals(testIL12.getMorphotype(),"testMorphotype");
        Assert.assertEquals(testIL12.getLiveORfixed(),"testLiveOrFixed");
        Assert.assertEquals(testIL12.getFixationmethod(),"testFixationMethod");
        Assert.assertEquals(testIL12.getInitialAFinoculum(),"testInitialAFinoculum");
        Assert.assertEquals(testIL12.getAfumigatusstrain(),"testAlumiatusstrain");
        Assert.assertEquals(testIL12.getInfectionmodel(),"testInfectionmodel");
        Assert.assertEquals(testIL12.getStrain(),"testStrain");
        Assert.assertEquals(testIL12.getAge(),"testAge");
        Assert.assertEquals(testIL12.getTreatment(),"testTreatment");
        Assert.assertEquals(testIL12.getInfectionroute(),"testInfectionroute");
        Assert.assertEquals(testIL12.getSample(),"testSample");
        Assert.assertEquals(testIL12.getSampleVolume(),"testSampleVolume");
        Assert.assertEquals(testIL12.getSampleSize(),"testSampleSize");
        Assert.assertEquals(testIL12.getUnits(),"testTUnits");
        Assert.assertEquals(testIL12.getMeasurements(),testMeasurements);
        Assert.assertEquals(testIL12.getTimes(),testTimes);
        Assert.assertEquals(testIL12.getCellconcentration(),"testCellConcentration");
        Assert.assertEquals(testIL12.getAnalysis(),"testAnalysis");
    }
    @Test
    public void testNPhilParameters() throws ParseException {
        NPhil testNPhil = new NPhil(1, "www.example.com", "testFigure",
                "testAuthor", "testMorphotype", "testLiveOrFixed",
                "testFixationMethod", "testInitialAFinoculum", "testAlumiatusstrain",
                "testInfectionmodel", "testStrain", "testAge",
                "testTreatment", "testInfectionroute", "testSample",
                "testSampleVolume", "testSampleSize", "testTUnits",
                ",1:test1,2:test2,3:test3,4:test4,5:test5,",
                "testCellConcentration", "testAnalysis");

        ArrayList<String> testTimes = new ArrayList<>();
        testTimes.add("1");
        testTimes.add("2");
        testTimes.add("3");
        testTimes.add("4");
        testTimes.add("5");
        HashMap<String,String> testMeasurements = new HashMap<>();
        testMeasurements.put("1","test1");
        testMeasurements.put("2","test2");
        testMeasurements.put("3","test3");
        testMeasurements.put("4","test4");
        testMeasurements.put("5","test5");

        Assert.assertEquals(testNPhil.getId(),1);
        Assert.assertEquals(testNPhil.getLink(),"www.example.com");
        Assert.assertEquals(testNPhil.getFigure(),"testFigure");
        Assert.assertEquals(testNPhil.getAuthor(),"testAuthor");
        Assert.assertEquals(testNPhil.getMorphotype(),"testMorphotype");
        Assert.assertEquals(testNPhil.getLiveORfixed(),"testLiveOrFixed");
        Assert.assertEquals(testNPhil.getFixationmethod(),"testFixationMethod");
        Assert.assertEquals(testNPhil.getInitialAFinoculum(),"testInitialAFinoculum");
        Assert.assertEquals(testNPhil.getAfumigatusstrain(),"testAlumiatusstrain");
        Assert.assertEquals(testNPhil.getInfectionmodel(),"testInfectionmodel");
        Assert.assertEquals(testNPhil.getStrain(),"testStrain");
        Assert.assertEquals(testNPhil.getAge(),"testAge");
        Assert.assertEquals(testNPhil.getTreatment(),"testTreatment");
        Assert.assertEquals(testNPhil.getInfectionroute(),"testInfectionroute");
        Assert.assertEquals(testNPhil.getSample(),"testSample");
        Assert.assertEquals(testNPhil.getSampleVolume(),"testSampleVolume");
        Assert.assertEquals(testNPhil.getSampleSize(),"testSampleSize");
        Assert.assertEquals(testNPhil.getUnits(),"testTUnits");
        Assert.assertEquals(testNPhil.getMeasurements(),testMeasurements);
        Assert.assertEquals(testNPhil.getTimes(),testTimes);
        Assert.assertEquals(testNPhil.getCellconcentration(),"testCellConcentration");
        Assert.assertEquals(testNPhil.getAnalysis(),"testAnalysis");
    }
    @Test
    public void testTNFAVivoParameters() throws ParseException {
        TNFAVivo testTNFAVivo = new TNFAVivo(1, "www.example.com", "testFigure",
                "testAuthor", "testMorphotype", "testLiveOrFixed",
                "testFixationMethod", "testInitialAFinoculum", "testAlumiatusstrain",
                "testInfectionmodel", "testStrain", "testAge",
                "testTreatment", "testInfectionroute", "testSample",
                "testSampleVolume", "testSampleSize", "testTUnits",
                ",1:test1,2:test2,3:test3,4:test4,5:test5,");

        ArrayList<String> testTimes = new ArrayList<>();
        testTimes.add("1");
        testTimes.add("2");
        testTimes.add("3");
        testTimes.add("4");
        testTimes.add("5");
        HashMap<String,String> testMeasurements = new HashMap<>();
        testMeasurements.put("1","test1");
        testMeasurements.put("2","test2");
        testMeasurements.put("3","test3");
        testMeasurements.put("4","test4");
        testMeasurements.put("5","test5");

        Assert.assertEquals(testTNFAVivo.getId(),1);
        Assert.assertEquals(testTNFAVivo.getLink(),"www.example.com");
        Assert.assertEquals(testTNFAVivo.getFigure(),"testFigure");
        Assert.assertEquals(testTNFAVivo.getAuthor(),"testAuthor");
        Assert.assertEquals(testTNFAVivo.getMorphotype(),"testMorphotype");
        Assert.assertEquals(testTNFAVivo.getLiveORfixed(),"testLiveOrFixed");
        Assert.assertEquals(testTNFAVivo.getFixationmethod(),"testFixationMethod");
        Assert.assertEquals(testTNFAVivo.getInitialAFinoculum(),"testInitialAFinoculum");
        Assert.assertEquals(testTNFAVivo.getAfumigatusstrain(),"testAlumiatusstrain");
        Assert.assertEquals(testTNFAVivo.getInfectionmodel(),"testInfectionmodel");
        Assert.assertEquals(testTNFAVivo.getStrain(),"testStrain");
        Assert.assertEquals(testTNFAVivo.getAge(),"testAge");
        Assert.assertEquals(testTNFAVivo.getTreatment(),"testTreatment");
        Assert.assertEquals(testTNFAVivo.getInfectionroute(),"testInfectionroute");
        Assert.assertEquals(testTNFAVivo.getSample(),"testSample");
        Assert.assertEquals(testTNFAVivo.getSampleVolume(),"testSampleVolume");
        Assert.assertEquals(testTNFAVivo.getSampleSize(),"testSampleSize");
        Assert.assertEquals(testTNFAVivo.getUnits(),"testTUnits");
        Assert.assertEquals(testTNFAVivo.getMeasurements(),testMeasurements);
        Assert.assertEquals(testTNFAVivo.getTimes(),testTimes);
    }
}
