package com.syntax.class12;
import java.util.Scanner;
public class First3Letter {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
	  
    String input=scan.next();
   String letter="";
   int i;
    for( i=0;i<=input.length();i++){
     letter=input.substring(0,3); 
    }
   System.out.print("The first 3 letter of "+input+" is "+ letter );
    
	System.out.println("=======or===="); 
	  System.out.println("The first 3 letters of "+input+ " is "+ input.substring(0,3));
	   
	  }
	}
  



