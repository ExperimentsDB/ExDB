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

        Assert.assertEquals(websites.get("index"),new webIndex().toString());
        Assert.assertEquals(websites.get("results"),new webResults().toString());
        Assert.assertEquals(websites.get("register"),new webRegister().toString());
        Assert.assertEquals(websites.get("signin"),new webSignin().toString());
        Assert.assertEquals(websites.get("result"),new webResult().toString());
        Assert.assertEquals(websites.get("stylesheets_common"),new webStylesheetCommon().toString());
        Assert.assertEquals(websites.get("scripts_resultsChartTemplate"),new webResultsChartTemplate().toString());
    }
    // @Test
    // public void testGetSearch(){}
}
