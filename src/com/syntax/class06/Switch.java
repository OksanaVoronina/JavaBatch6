package com.syntax.class06;
import java.util.Scanner;

public class Switch {
public static void main(String args[]) {
	
	
	Scanner scan= new Scanner(System.in);
	System.out.println(" What is your gender:M or F");
	char gender=scan.next().charAt(0);
	String genderType;
	switch(gender) {
	
	case 'M':
		genderType="Male";
		break;
	case 'F':
	genderType="Famele";
	 default:
		genderType= "invalid";
	}
	System.out.println(" your are is "+ genderType);
	
	
}
}
