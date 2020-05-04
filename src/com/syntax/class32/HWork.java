package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HWork {
	//Using xl file that we created to new tour application
	//(http://www.newtours.demoaut.com/) create a data driven test: 
	//Register to an account using 3-4 different sets of data 
	//(exclude passing values to the drop down and try to use different locators 
	//that you know if possible)
	//public static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
		String filePath=System.getProperty("user.dir")+"/Testdata/Info.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wbook= new XSSFWorkbook(fis);
		Sheet sheet=wbook.getSheet("Sheet1");
		int row=sheet.getPhysicalNumberOfRows();
		int cell=sheet.getRow(0).getLastCellNum();
		
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	     //WebDrive driver=new ChromeDriver();
		
		List<Map<String,String>> list=new ArrayList<>();
		
		for(int r=1;r<row;r++) {
			Map<String,String> map=new LinkedHashMap<>();
			
			for(int c=0;c<cell;c++) {
				
			}
			//list.add(r);
		}
		
	}
}
