package com.syntax.class13;
import java.util.Scanner;
public class Palindromes {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
	   String letter2="";
	   	boolean isPalindrome=true;
	   givenString=givenString.replace(" ","");
	  

	   	for(int a=givenString.length()-1;a>=0;a-- ) {
	   letter2+=givenString.charAt(a);
	   
	   }
	   	  if(givenString.equalsIgnoreCase(letter2)){
	   	    System.out.print(isPalindrome);
	   	  }else{
	   		  isPalindrome=false;
	   	    System.out.print(isPalindrome);
	   	  }
	   	}
	}
	  
	
	

