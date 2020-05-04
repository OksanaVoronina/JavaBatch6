package com.syntax.class32;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelntro {
public static void main(String[] args) throws IOException {
	String filePath="/Users/oksanavoronina/eclipse-workspace/JavaBasics/Testdata/Test1.xlsx";
	FileInputStream fis=new FileInputStream(filePath);
	XSSFWorkbook wbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=wbook.getSheetAt(0);
	Row row1=sheet.getRow(0);
	Cell  cell=row1.getCell(1);
	String r1cell2=cell.toString();
	System.out.println(r1cell2);
	Row row3=sheet.getRow(2);
	int rows=sheet.getPhysicalNumberOfRows();
	
	//find number of columns
	int cols=sheet.getRow(0).getLastCellNum();
	
	//get data from all rows and all columns
	for(int r=0; r<rows;r++) {//iterates over rows
		for(int c=0; c<cols; c++) {//iterates over cols
			String cellVal=sheet.getRow(r).getCell(c).toString();
			System.out.print(cellVal+"  ");
		}
		System.out.println();
	}
}
}
