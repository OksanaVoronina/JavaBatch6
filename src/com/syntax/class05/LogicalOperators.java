package com.syntax.class05;
import java.util.Scanner;
public class LogicalOperators {
public static void main(String args[]) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your age");
	int age = scan.nextInt();
	
	if (age >0 && age<3) {
		System.out.println("your are baby");
	}
	else if (age>=3 && age<=5) {
		System.out.println("kid");
		}
	else if (age>=6 && age <=12) {
		System.out.println("child");
	}
	else if (age>=13 && age<=19) {
		System.out.println("you are teen");
	}
	else {
		System.out.println("you are enjoyng your life");
	}
	
}
}
