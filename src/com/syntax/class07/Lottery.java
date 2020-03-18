package com.syntax.class07;

import java.util.Scanner;

public class Lottery {
	public static void main(String args[]) {

		int numInput;
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("enter number from 1-20");
		

	*	do {
			
	*			System.out.println("try again");
	*		numInput = scan.nextInt();
		
	*} while (numInput != 17);

	*	System.out.println("congrats");

	*}
   */
	int num=17;
	System.out.println("enter number from 1-20");
	numInput=scan.nextInt();
	while(numInput!=num) {
		
	  System.out.println("try again"); 
		 numInput=scan.nextInt();
	}
	System.out.print("you got it!!!");
	
	}
}
