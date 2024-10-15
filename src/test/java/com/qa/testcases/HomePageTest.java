package com.qa.testcases;

import com.qa.base.BaseClass;
import com.qa.dataprovider.DataProviders;
import com.qa.pageobjects.*;
import com.qa.utilities.TestLogger;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class HomePageTest extends BaseClass {

    IndexPage indexPage;
    LoginPage loginPage;
    HomePage homePage;
    SearchResultPage searchResultPage;
    AddToCartPage addToCartPage;

    @BeforeMethod
    public void setUp(){
        launchApp();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    //@Test( dataProvider = "TestData", dataProviderClass = DataProviders.class)
    @Test
    public void CartTest() throws InterruptedException {

        TestLogger.startTestCase("CartTest");
        indexPage = new IndexPage();
        searchResultPage = new SearchResultPage();
        addToCartPage = new AddToCartPage();
        //loginPage = indexPage.clickOnSignInButton();
        //homePage = loginPage.login(prop.getProperty("userid"), prop.getProperty("password"));
        searchResultPage = indexPage.searchItem();
        searchResultPage.addItemToCart();
        //addToCartPage.goToCart();
        //driver.wait(5000);
        //addToCartPage.emptyCart();
        //driver.wait(5000);
        TestLogger.endTestCase("CartTest");
        System.out.println("Checker");
    }

/*    @Test
    @Parameters ({"val1", "val2"})
    public void CarterTest(int v1, int v2) throws InterruptedException {
        int finalsum = v1 + v2;
        System.out.println("The final sum of the given values is " + finalsum);
        TestLogger.startTestCase("CartTest");
        indexPage = new IndexPage();
        searchResultPage = new SearchResultPage();
        addToCartPage = new AddToCartPage();
        //loginPage = indexPage.clickOnSignInButton();
        //homePage = loginPage.login(prop.getProperty("userid"), prop.getProperty("password"));
        searchResultPage = indexPage.searchItems();
        searchResultPage.addItemToCart();
        //addToCartPage.goToCart();
        //driver.wait(5000);
        //addToCartPage.emptyCart();
        //driver.wait(5000);
        TestLogger.endTestCase("CartTest");
    }*/

}
