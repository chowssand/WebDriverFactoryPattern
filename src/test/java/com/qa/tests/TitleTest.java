package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleTest extends BaseTest {
    @Test
    public void launchTestAutomationGuruTest() {
        driver.get("http://testautomationguru.com");
        Assert.assertEquals("TestAutomationGuru – A technical blog on test automation", driver.getTitle());
    }

    @Test
    public void launchGoogleTest() {
        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
    }

    @Test
    public void launchYahooTest() {
        driver.get("https://www.yahoo.com");
        Assert.assertEquals("Yahoo", driver.getTitle());
    }
}
