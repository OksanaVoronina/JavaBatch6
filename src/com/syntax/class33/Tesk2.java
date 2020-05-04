package com.syntax.class33;

import java.util.Scanner;

public class Tesk2 {
public static void main(String[] args) {
	
	//How would handle InputMismatchException? Input Mismatch Exception
	//when user enters mismatch value then programmer expected
	Scanner scan = new Scanner(System.in);
	int num = 0;
	System.out.print("Enter an integer: ");
	try {
		num = scan.nextInt();
	} catch (Exception e) {
		System.out.println("Exception name is: "+e);
	}
 
}
}
