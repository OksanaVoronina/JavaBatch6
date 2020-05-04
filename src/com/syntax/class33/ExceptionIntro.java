package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {
public static void main(String[] args) {
	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("InterruptedException");
		}
		System.out.println("code is continue");
		String str="";
		try {
			FileInputStream fis=new FileInputStream(str);
			
		}catch( FileNotFoundException fne) {
			fne.printStackTrace();//you will get name of e,line ,message about e 
			System.out.println(fne.getMessage());
			System.out.println("FileNotFoundException");//getting  name and message about e
		}
		System.out.println("End of the program");
	
	
}
}
