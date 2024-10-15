package com.qa.utilities;

import com.aventstack.extentreports.ExtentReports;
import lombok.extern.java.Log;

import java.util.logging.Logger;

public class TestLogger {

public static Logger log = Logger.getLogger(Log.class.getName());

public static void startTestCase(String sTestCaseName){
    log.info("-----------------"+sTestCaseName +" started"+"-----------------");
}
    public static void endTestCase(String sTestCaseName){
        log.info("-----------------"+sTestCaseName +" ended"+"-----------------");
    }
}
