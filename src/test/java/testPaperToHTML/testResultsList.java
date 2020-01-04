package testPaperToHTML;

import Papers.*;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import paperToHTML.*;

import java.util.ArrayList;

public class testResultsList {
    // Tests that ResultsList creates the correct string of results with all paper types
    @Test
    public void testResultsString() throws ParseException {
        ArrayList<Paper> papers = new ArrayList<>();
        IL8 testIl8 = new IL8(1, "www.example.com", "testFigure",
                "testAuthor", "testMorphotype", "testLiveOrFixed",
                "testFixationMethod", "testInitialAFinoculum", "testAlumiatusstrain",
                "testInfectionmodel", "testStrain", "testAge",
                "testTreatment", "testInfectionroute", "testSample",
                "testSampleVolume", "testSampleSize", "testTUnits",
                ",1:test1,2:test2,3:test3,4:test4,5:test5,");
        IL12 testIL12 = new IL12(1, "www.example.com", "testFigure",
                "testAuthor", "testMorphotype", "testLiveOrFixed",
                "testFixationMethod", "testInitialAFinoculum", "testAlumiatusstrain",
                "testInfectionmodel", "testStrain", "testAge",
                "testTreatment", "testInfectionroute", "testSample",
                "testSampleVolume", "testSampleSize", "testTUnits",
                ",1:test1,2:test2,3:test3,4:test4,5:test5,",
                "testCellConcentration", "testAnalysis");
        NPhil testNPhil = new NPhil(1, "www.example.com", "testFigure",
                "testAuthor", "testMorphotype", "testLiveOrFixed",
                "testFixationMethod", "testInitialAFinoculum", "testAlumiatusstrain",
                "testInfectionmodel", "testStrain", "testAge",
                "testTreatment", "testInfectionroute", "testSample",
                "testSampleVolume", "testSampleSize", "testTUnits",
                ",1:test1,2:test2,3:test3,4:test4,5:test5,",
                "testCellConcentration", "testAnalysis");
        TNFAVivo testTNFAVivo = new TNFAVivo(1, "www.example.com", "testFigure",
                "testAuthor", "testMorphotype", "testLiveOrFixed",
                "testFixationMethod", "testInitialAFinoculum", "testAlumiatusstrain",
                "testInfectionmodel", "testStrain", "testAge",
                "testTreatment", "testInfectionroute", "testSample",
                "testSampleVolume", "testSampleSize", "testTUnits",
                ",1:test1,2:test2,3:test3,4:test4,5:test5,");

        papers.add(testIl8);
        papers.add(testIL12);
        papers.add(testNPhil);
        papers.add(testTNFAVivo);
        // Manually creating a results string to check against ResultsList function
        StringBuilder papersToString = new StringBuilder();
        for (Paper paper : papers){
            papersToString.append(new cardCreator(paper).toString());
        }
        String testResults = papersToString.toString();

        ResultsList testResultsList = new ResultsList(papers);

        Assert.assertEquals(testResultsList.toString(),testResults);
    }
}
