package com.qa.actiondrivers;

import com.qa.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Action extends BaseClass {
    public static void implicitWait(WebDriver ldriver, int time) {
        try{
            ldriver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void explicitWait(WebDriver ldriver, Duration time, WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(ldriver,time);
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public static void pageTimeOut(WebDriver ldriver, int time){
        try {
            ldriver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void click(WebDriver ldriver, WebElement element){
        element.click();
    }
    public static boolean isDisplayed(WebDriver ldriver, WebElement element){
        return element.isDisplayed();
    }
    public static void type(WebElement ele, String text){
        ele.sendKeys(text);
    }
}
