package com.qa.pageobjects;

import com.qa.actiondrivers.Action;
import com.qa.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends BaseClass {

    @FindBy(xpath = "//*[@id='ewc-compact-actions-container']/div/div[2]/span")
    WebElement Cart;

    @FindBy(xpath = "//input[@value='Delete']")
    WebElement Delete;

    public  AddToCartPage(){
        PageFactory.initElements(driver,this);
    }

    public void goToCart() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Cart);
        driver.wait(5000);
        Action.click(driver,Cart);
    }
    public void emptyCart() throws InterruptedException {
        driver.wait(5000);
        Action.click(driver,Delete);
    }

}
