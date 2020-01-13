package testWebsite;

import org.junit.Assert;
import org.junit.Test;
import website.Websites;
import website.*;

public class testWebsites {
    // Tests that each id in the HashMap has the correct website in it
    @Test
    public void testWebsiteList(){
        Websites websites = new Websites();

        Assert.assertEquals(websites.get("index"),new WebIndex().toString());
        Assert.assertEquals(websites.get("results"),new WebResults().toString());
        Assert.assertEquals(websites.get("register"),new WebRegister().toString());
        Assert.assertEquals(websites.get("signin"),new WebSignin().toString());
        Assert.assertEquals(websites.get("result"),new WebResult().toString());
        Assert.assertEquals(websites.get("stylesheets_common"),new WebStylesheetCommon().toString());
        Assert.assertEquals(websites.get("scripts_resultsChartTemplate"),new WebResultsChartTemplate().toString());
    }
}
