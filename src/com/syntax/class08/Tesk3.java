package com.syntax.class08;
import java.util.Scanner;
public class Tesk3 {
	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		
		int evenNum=0;
		int oddsNum=0;
		System.out.println("enter num start");
		int start=scan.nextInt();
		System.out.println("enter end");
		int end=scan.nextInt();
		
		for(int i=start; i<=end;i++) {
			  if(i%2 !=0) {
				  oddsNum=oddsNum+i;
			  }
			  else {
				  evenNum=evenNum+i;
				 
			  }
		
		}
		System.out.println(oddsNum);
		System.out.println(evenNum);
	}

}
