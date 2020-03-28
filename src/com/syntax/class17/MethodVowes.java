package com.syntax.class17;

public class MethodVowes {
	//Create a method that will accept a String 
	//as a parameter and return a new String 
	//that consist only of vowels. Method should be
	//available inside the class where it was declared 
	//and executed by calling it is name.
	
	private static String  getString(String newString) {
		String vowels=newString.replaceAll("[^AEIOUaeiou]", "");
		
		return vowels;
	}
	public static void main(String args[]) {
		MethodVowes obj=new MethodVowes();
		String vowels1=obj.getString("Hello world");
		System.out.println(vowels1);
	}
}
