package com.syntax.class06;
import java.util.Scanner;
public class IfNasted{
	public static void main(String args[]) {
		
		 Scanner scan= new Scanner(System.in);
		 System.out.println("enter num");
		 int num1=scan.nextInt();
		 int num2=scan.nextInt();
		 int num3=scan.nextInt();
		
		 int largest;
		 
		 if ( num1>num2) {
			 if( num1>num3) {
               largest=num1;
			 }
			 else {
			 largest=num3;
		 }
		 }else{
				 if (num2>num3) {
					 largest=num2;
			 }else {
				 largest=num3;
				 } 
		 }
		 System.out.println(" largest num is " +largest);
		 
		 }
		 
	}


