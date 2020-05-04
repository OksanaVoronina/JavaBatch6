package com.syntax.class32;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practies {
public static void main(String[] args) throws IOException {
	String filePath="/Users/oksanavoronina/eclipse-workspace/JavaBasics/Testdata/Test1.xlsx";

	//String filePath="/Users/oksanavoronina/eclipse-workspace/JavaBasics/Testdata/Test1.xlsx⁩";
	FileInputStream fis=new FileInputStream(filePath);
	Workbook wbook=new XSSFWorkbook(fis);
	Sheet sheet=wbook.getSheet("Sheet1");
	Row row1=sheet.getRow(0);
	Cell cell=row1.getCell(1);
	System.out.println(cell);
	//get value
	String r1call2=cell.toString();
	System.out.println(r1call2);
	String cellValue=sheet.getRow(2).getCell(3).toString();
	System.out.println(cellValue);
	
	double num=sheet.getRow(1).getCell(4).getNumericCellValue();
	System.out.println((int)num);// to get off .0 convert to int
	String num1=sheet.getRow(1).getCell(4).toString();
    String[] split=num1.split("\\.");//to get off .0 from string
    System.out.println(split[0]);
    // to get all sheet
     int rows=sheet.getPhysicalNumberOfRows();//number of rows
    int cells=sheet.getRow(0).getLastCellNum();// number of cells
    for(int i=0;i<rows;i++) {
    	for(int a=0;a<cells;a++) {
    	String value=sheet.getRow(i).getCell(a).toString();
    		System.out.print(value+" ");
    	}
    	System.out.println();
    }
	
	
}
}
