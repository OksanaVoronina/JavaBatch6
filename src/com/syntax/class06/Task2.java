package com.syntax.class06;
import java.util.Scanner;
public class Task2 {
public static void main(String args[]) {
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("What ius your grade?");
	char gradeInput=scan.next().charAt(0);
	String grade;
	
	switch(gradeInput) {
	
	case 'A':
		grade="Excellent";
		break;
	case 'B':
		grade="Good";
		break;
	case 'C':
		grade="Average";
		break;
	case 'D':
		grade="bad";
		break;
		default:
			grade="Unknown";
		}
	System.out.println(" your enter " +gradeInput +" your grade is "+ grade);
	
	
}
}
