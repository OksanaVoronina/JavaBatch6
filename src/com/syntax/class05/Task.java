package com.syntax.class05;
import java.util.Scanner;
public class Task {
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your heights");
		int height=scan.nextInt();
		
		if (height>=0 && height<=60) {
			System.out.println(" You are short");
		}
		else if( height >=60 && height <=72) {
			System.out.println(" your are medium");
		}
		else {
			System.out.println(" you are toll");
		}
	}
	
}
