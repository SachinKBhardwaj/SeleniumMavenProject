package com.qa.pageobjects;

import com.qa.actiondrivers.Action;
import com.qa.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends BaseClass {

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

    @FindBy(xpath = "//*[@id='nav-link-accountList-nav-line-1']")
    WebElement loggedInUserName;

    @FindBy(xpath = "//*[@id='glow-ingress-line1']")
    WebElement DeliveryName;

    @FindBy(xpath = "//*[@id='glow-ingress-line2']")
    WebElement DeliveryLocation;

    public  HomePage(){
        PageFactory.initElements(driver,this);
    }
    public String validateDeliveryName(){
        return DeliveryName.getText();
    }
    public String validateDeliveryLocation(){
        return DeliveryLocation.getText();
    }
    public SearchResultPage searchItem(){
        searchBox.sendKeys("samsung s24 ultra");
        Action.click(driver,searchButton);
        return new SearchResultPage();
    }


}
