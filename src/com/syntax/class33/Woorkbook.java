package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Woorkbook {
public static void main(String[] args) throws IOException {
	
	String file=System.getProperty("user.dir")+"/Testdata/Info.xlsx";
	FileInputStream fis=new FileInputStream(file);
	
	Workbook book= new XSSFWorkbook(fis);
	Sheet sheet=book.getSheet("Sheet1");
	
	
	int rows=sheet.getPhysicalNumberOfRows();
	int cells=sheet.getRow(0).getLastCellNum();
	List<Map<String,String>> list=new ArrayList<>();
	 
	for(int i=1;i<rows;i++) {
		Map<String,String>map=new LinkedHashMap<>();
		for(int c=0;c<cells;c++) {
		String row=sheet.getRow(0).getCell(c).toString();
		String cell=sheet.getRow(i).getCell(c).toString();
			map.put(row,cell);
		}
		list.add(map);

	}
	System.out.println(list);
	
	for(Map<String,String > m:list) {
		System.out.println(m);
	}
	
	}
}

