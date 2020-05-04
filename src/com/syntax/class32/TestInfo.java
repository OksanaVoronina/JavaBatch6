package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestInfo {
public static void main(String[] args) throws IOException {
	String filePath="/Users/oksanavoronina/eclipse-workspace/JavaBasics/configs/Browser.properties";
	FileInputStream file=new FileInputStream(filePath);
	Properties prop=new Properties();
	prop.load(file);
	prop.getProperty("browser");

	prop.getProperty("url");
	filePath="/Users/oksanavoronina/eclipse-workspace/JavaBasics/Testdata/Info.xlsx";
	FileInputStream fis=new FileInputStream(filePath);
	XSSFWorkbook wbook=new XSSFWorkbook(fis);
	Sheet sheet=wbook.getSheet("Sheet1");
	sheet.getRow(1).getCell(3);
	
	int rows=sheet.getPhysicalNumberOfRows();
	System.out.println(rows);

	int cols=sheet.getRow(0).getLastCellNum();
	System.out.println(cols);
	//get data from all rows and all columns
	for(int r=0; r<rows;r++) {//iterates over rows
		for(int c=0; c<cols; c++) {//iterates over cols
			String cellVal=sheet.getRow(r).getCell(c).toString();
			System.out.format("%20s",cellVal,"  ");
		}
		System.out.println();
	}

}
}
