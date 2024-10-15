package com.qa.utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelUtil {
    public static String xcelPath = System.getProperty("user.dir") + "\\TestData\\ExcelTestData.xlsx";
    //public static String xcelPath = System.getProperty("C:\\Users\\ADMIN\\SeleniumMavenProject\\TestData\\ExcelTestData.xlsx");
    //public static String xcelPath = "C:\\Users\\ADMIN\\SeleniumMavenProject\\TestData\\ExcelTestData.xlsx";
    public static FileInputStream fis = null;
    public static FileOutputStream fos = null;
    public static XSSFWorkbook workbook = null;
    public static XSSFSheet sheet = null;
    private XSSFRow row = null;
    private XSSFCell cell = null;

     public ExcelUtil(String excelpath, String sheetName){
    try {
        File file = new File(xcelPath);
        fis = new FileInputStream(file);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);
        } catch (IOException e) {
        System.out.println("ghfffffffffffffff");
        System.out.println("ghfffffffffffffff");
        throw new RuntimeException(e);
        }
}


public static int getRowCount(){
    int rowCount = sheet.getPhysicalNumberOfRows();
    return rowCount;
}
    public static int getColCount() {
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        return colCount;
    }
    public static String getCellDataString(int rowNum, int colNum){
            String cellData = null;
            try{
                cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
                System.out.println(cellData);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return cellData;
    }

    public static void getCellDataNumber(int rowNum, int colNum){
         try{
             double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
             System.out.println(cellData);
         }catch (Exception e) {
             throw new RuntimeException(e);
         }

    }
}
