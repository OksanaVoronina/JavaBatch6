package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
public static void main(String[] args) throws IOException {
	
	String filePath =System.getProperty("user.dir")+"/Testdata/Test1.xlsx";
	FileInputStream fis=new FileInputStream(filePath);
	Workbook wbook= new XSSFWorkbook(fis);

	Sheet sheet=wbook.getSheet("Sheet1");
	sheet.createRow(4).createCell(0).setCellValue("hello");
	sheet.getRow(0).createCell(5).setCellValue("HI");
	Sheet newSheet=wbook.createSheet("TestSheet");
	FileOutputStream fos=new FileOutputStream(filePath);
	wbook.write(fos);
	
}
}
