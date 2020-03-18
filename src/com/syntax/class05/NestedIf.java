package com.syntax.class05;

public class NestedIf {
public static void main(String args[]) {
	int day=5;
	int day1=7;
	
	if(day==2 || day==3) {
		System.out.println("Today is SDLC Class");
	} 
	else if (day==5 || day==7) {
		System.out.println("Today is JAVA Class");
		}
	else if( day==1 || day==6) {
		System.out.println("Today is a reviw class with Elion");
	}
	else {
		System.out.println("Invalid day");
	}
	System.out.println("-------------------");
	
	String day2="Saturday";
	
	if (day2.equals("Saturday") || day2.equals("Wednesday")){
		System.out.println("Today is SDLC  Class");
	}
	else if (day2.contentEquals("Tueasday") || day2.contentEquals("sunday")) {
		System.out.println("Today is java");
	}
}
}
