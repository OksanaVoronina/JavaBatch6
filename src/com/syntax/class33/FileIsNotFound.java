package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileIsNotFound {

		 public static void main(String args[]){
		   try{
		    	FileInputStream fis=new FileInputStream(method());
				Properties wbook=new Properties();
				wbook.load(fis);
		   }catch( IOException fnfe){
			  System.out.println( fnfe);
		     
		   }
		   // from second way
			try {
				read("");
			} catch (FileNotFoundException e) {
				System.out.println(e);
			
			}
		 }
		 static String method(){
	 String filePath="";
	 return filePath; 
		 

		}
//or other way how to throw exception to main method
		public static void read(String filePath) throws FileNotFoundException {

			FileInputStream fis = new FileInputStream(filePath);

		}
	}

