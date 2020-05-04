package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertyFile {
public static void main(String[] args) throws IOException {
	
	String filePath="/Users/oksanavoronina/eclipse-workspace/JavaBasics/configs/Examples.properties";
	
	FileInputStream fis=new FileInputStream(filePath);
	Properties prop=new Properties();
	prop.load(fis);//to write back to file first load file
	
	prop.setProperty("phomeNum","1234567");
	//push back path 
	FileOutputStream fos= new FileOutputStream(filePath);
	prop.store(fos, "added atitional key");
}
}
