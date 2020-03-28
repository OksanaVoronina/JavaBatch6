package com.syntax.class17;

public class MethodString {
	//Create a method that will take a String as a parameter 
	//and returns reverse String. Method should be available
	//to all classes within your projects and accessible by class name.
	
	public static String getString(String name) {
		
		String letter="";
		for(int i=name.length()-1;i>=0;i--) {
			letter+=name.charAt(i);
				
		}
			
           return letter;

	}
	public static void main(String args[]) {
		
		System.out.print( getString("hello guys"));

	}
}
