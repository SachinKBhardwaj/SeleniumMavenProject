package com.qa.pageobjects;

import com.qa.actiondrivers.Action;
import com.qa.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(xpath = "//*[@id='ap_email']")
    WebElement emailIdTextBoxLoginPage;

    @FindBy(xpath = "//*[@id='continue']")
    WebElement continueButtonLoginPage;

    @FindBy(xpath = "//*[@id='ap_password']")
    WebElement passwordTextBoxLoginPage;

    @FindBy(xpath = "//*[@id='signInSubmit']")
    WebElement SignInButtonLoginPage;

    public  LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public HomePage login(String name, String pwd){
        Action.implicitWait(driver,2);
        Action.type(emailIdTextBoxLoginPage, name);
        Action.implicitWait(driver,10);
        Action.click(driver,continueButtonLoginPage);
        Action.implicitWait(driver,10);
        Action.type(passwordTextBoxLoginPage, pwd);
        Action.implicitWait(driver,2);
        Action.click(driver,SignInButtonLoginPage);
        return new HomePage();
    }

}
