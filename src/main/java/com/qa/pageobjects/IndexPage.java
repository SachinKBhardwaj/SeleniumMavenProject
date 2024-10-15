package com.qa.pageobjects;

import com.qa.actiondrivers.Action;
import com.qa.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BaseClass {

    @FindBy(xpath = "//*[@id='nav-link-accountList-nav-line-1']")
    WebElement signInBtn;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchBox;

    @FindBy(xpath = "//*[@id='nav-search-submit-button']")
    WebElement searchButton;

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    WebElement logo;

    @FindBy(xpath = "//*[@id='nav-cart']")
    WebElement cart;

    public  IndexPage(){
        PageFactory.initElements(driver,this);
    }
    public LoginPage clickOnSignInButton(){
        Action.implicitWait(driver,2);
        Action.click(driver,signInBtn);
        return new LoginPage();
    }
    public SearchResultPage searchItem(){
        //logger= LogManager.getLogManager().getLogger(IndexPage.class);
        searchBox.sendKeys("s23");
        Action.click(driver,searchButton);
        return new SearchResultPage();
    }

    public SearchResultPage searchItems(){
        //logger= LogManager.getLogManager().getLogger(IndexPage.class);
        searchBox.sendKeys("Galaxy s9 plus");
        Action.click(driver,searchButton);
        return new SearchResultPage();
    }
    public boolean validateLogo(){
        return Action.isDisplayed(driver,logo);
    }
    public String getTitle(){
        return driver.getTitle();
    }


}
