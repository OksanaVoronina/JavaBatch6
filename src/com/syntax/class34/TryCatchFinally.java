package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {


public static int division(int a,int b) {
	int results=0;
	try {
		results=a/b;
		System.out.println(results);
	}catch(ArithmeticException ae) {
		//System.out.println(ae);
		System.out.println(ae.getMessage());//message of exception
		//ae.printStackTrace();//detailed message
	}finally {
		System.out.println("I am final block");
	}
	return results;
}
public static void file(String filePath) {
	FileInputStream fis=null;
	try {
	fis=new FileInputStream(filePath);
Properties prop=new Properties();
prop.load(fis);
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}finally {
	try {
		if(fis!=null) {
		fis.close();
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	
}
}
