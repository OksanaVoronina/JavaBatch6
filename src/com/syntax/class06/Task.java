package com.syntax.class06;
import java.util.Scanner;

public class Task {
public static  void main(String args[]) {
	
	Scanner scan= new Scanner(System.in);
	System.out.println("What is your country");
	String country;
	country= scan.next();
	String yourLanguage;
	
	switch(country.toLowerCase()) {

	case "ukraine":
		yourLanguage="Ukrainian";
		break;
	case "russian":
		yourLanguage="Russian";
		break;
	case "turkey":
		yourLanguage="turkish";
		break;
		
	default:
	yourLanguage="Unknown";
	}
	System.out.println(" you are from "+ country +" and "+ " your language is "+
	yourLanguage);
	}
}
