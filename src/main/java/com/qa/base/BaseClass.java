package com.qa.base;

import com.qa.actiondrivers.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.w3c.dom.DOMConfiguration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class BaseClass {

public static Properties prop;
public static WebDriver driver;
public static Logger logger;

@BeforeTest
public void loadConfig(){
    try{
        prop=new Properties();
        FileReader reader=new FileReader("Configuration/Config.properties");
        prop.load(reader);

    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

public static void launchApp(){
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(prop.getProperty("url"));
    Action.implicitWait(driver,20);
    Action.pageTimeOut(driver,10);
}
}
