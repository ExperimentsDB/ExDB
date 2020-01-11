package testPaperToHTML;

import Papers.*;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import paperToHTML.cardCreator;
import website.webResult;

public class testCardCreator {
    // Tests that the cardCreator creates the correct card with all Paper types
    @Test
    public void testCard() throws ParseException {
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

        cardCreator cardIL8 = new cardCreator(testIl8);
        cardCreator cardIL12 = new cardCreator(testIL12);
        cardCreator cardNPhil = new cardCreator(testNPhil);
        cardCreator cardTNFAVivo = new cardCreator(testTNFAVivo);

        // Function used to create cards from each paper type
        String templateIL8 = templateCreator(testIl8);
        String templateIL12 = templateCreator(testIL12);
        String templateNPhil = templateCreator(testNPhil);
        String templateTNFAVivo = templateCreator(testTNFAVivo);

        Assert.assertEquals(cardIL8.toString(),templateIL8);
        Assert.assertEquals(cardIL12.toString(),templateIL12);
        Assert.assertEquals(cardNPhil.toString(),templateNPhil);
        Assert.assertEquals(cardTNFAVivo.toString(),templateTNFAVivo);

    }
    // Function to manually create the templates to test the cardCreator cards
    private String templateCreator(Paper paper){
        String template = new webResult().toString();
        template = template.replace("LINK", paper.getLink());
        template = template.replace("TITLE", "Paper " + paper.getId());
        template = template.replace("AUTHOR", paper.getAuthor());
        return template;
    }
}
