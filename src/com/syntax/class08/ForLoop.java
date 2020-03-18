package com.syntax.class08;
import java.util.Scanner;
public class ForLoop {
	public static void main(String args[]) {
		
		
		Scanner scan=new Scanner(System.in);
		
		
		int evenOfNum=0;
		int oddOfNum=0;
	
		 
		for(int i=1;i<=99;i++) {
			
			if(i%2==0) {
				evenOfNum+=i;
				
				}
			else {
				oddOfNum+=i;
				
			}
		
		}
		System.out.println(oddOfNum);
	
	System.out.println(evenOfNum);
}
}
		
		
		
	


