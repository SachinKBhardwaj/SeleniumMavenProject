package com.qa.dataprovider;

import com.qa.utilities.ExcelUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;

public class DataProviders {

/*    static String path = System.getProperty("user.dir") +"\\TestData\\ExcelTestData.xlsx";
    static String sheet = "Test1";*/

/*    @Test(dataProvider = "TestData", dataProviderClass = DataProviders.class)
    public void testInputdata(String a){
        System.out.println(a);
    }*/


    @DataProvider(name = "TestData")
    public Object[][] getData(){
        String excelpath = System.getProperty("user.dir") +"\\TestData\\ExcelTestData.xlsx";
        String sheet = "Test1";
        Object[][] data = testData(excelpath, sheet);
        return data;
    }

    public Object[][] testData(String excelpath, String sheetName){
        String path = System.getProperty("user.dir") +"\\TestData\\ExcelTestData.xlsx";
        String sheet = "Test1";

        ExcelUtil excelUtil = new ExcelUtil(excelpath,sheetName);

        int rowCount = excelUtil.getRowCount();
        int colCount = excelUtil.getColCount();

        Object data[][] = new Object[rowCount-1][rowCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                String cellData = excelUtil.getCellDataString(i,j);
                System.out.println(cellData);
                data[i][j] = cellData;
            }

        }
        return data;

    }
}

