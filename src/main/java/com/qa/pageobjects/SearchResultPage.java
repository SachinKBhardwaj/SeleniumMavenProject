package com.qa.pageobjects;

import com.qa.actiondrivers.Action;
import com.qa.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class SearchResultPage extends BaseClass {


    @FindBy(xpath = "//span[text()='Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Gray, 12GB, 256GB Storage)']")
    WebElement searchItem;

    @FindBy(xpath = "//button[text()='Add to cart']")
    WebElement addtemToCart;

    @FindBy(xpath = "//*[@id='nav-cart-count']")
    WebElement Cart;

    @FindBy(xpath = "//input[@value='Delete']")
    WebElement Delete;

    public  SearchResultPage(){
        PageFactory.initElements(driver,this);
    }
    public boolean isProductAvailable(){
        return Action.isDisplayed(driver,searchItem);
    }

    public void addItemToCart() throws InterruptedException {

        //return new AddToCartPage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addtemToCart);
        Action.click(driver, addtemToCart);
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Cart);
        Action.click(driver,Cart);
        Action.click(driver,Delete);


        Thread.sleep(500);
    }
}
