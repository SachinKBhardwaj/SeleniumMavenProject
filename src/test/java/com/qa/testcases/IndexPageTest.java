package com.qa.testcases;

import com.qa.base.BaseClass;
import com.qa.pageobjects.IndexPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IndexPageTest extends BaseClass {

    IndexPage indexPage;

    @BeforeMethod
    public void setUp(){
        launchApp();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test(priority = 1)
    public void verifyLogo(){
        indexPage = new IndexPage();
        boolean result = indexPage.validateLogo();
        Assert.assertTrue(result);
    }
    @Test(priority = 2)
    public void verifyTitle(){
        String actualTitle = indexPage.getTitle();
        Assert.assertEquals(actualTitle,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }

}
