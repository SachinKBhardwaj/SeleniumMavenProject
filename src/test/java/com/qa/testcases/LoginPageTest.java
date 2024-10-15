package com.qa.testcases;

import com.qa.base.BaseClass;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.IndexPage;
import com.qa.pageobjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {

    IndexPage indexPage;
    LoginPage loginPage;
    HomePage homePage;
    @BeforeMethod
    public void setUp(){
        launchApp();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void loginTest(){
        indexPage = new IndexPage();
        loginPage = indexPage.clickOnSignInButton();
        homePage = loginPage.login(prop.getProperty("userid"),prop.getProperty("password"));
        String userLocation = homePage.validateDeliveryLocation();
        String userName = homePage.validateDeliveryName();
        Assert.assertEquals(userName, "Deliver to Sachin");
    }
}
