package com.syntax.class12;
import java.util.Scanner;
public class MatchInput {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 
		   String output="";
		  if(language.equalsIgnoreCase("java")){
		    output=language;
		  }
		    else if( language.equalsIgnoreCase("C")){
		      output=language;
		    }
		    else if(language.equalsIgnoreCase("C++")){
		      output=language;
		    }
            else{
	    System.out.println("Doesn't match any programming language");
		   System.out.println(output + " is a programming language");

	}
}
}

		
	


