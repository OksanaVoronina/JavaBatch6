package com.syntax.class17;

public class Repl {
	 
		   int year;
		   String schooleName;
		   int batch;
		   
		  
		   
		   public static void main(String args[]){
		    Repl obj=new Repl();
		     obj.year=2020;
		     obj.batch=6;
		     obj.schooleName="Syntax";
		     System.out.println("I am a student of batch "+ obj.batch+ " studying at "+
		     obj.schooleName+" in the year of "+obj.year);
		   }
}

