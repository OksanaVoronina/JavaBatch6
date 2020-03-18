package com.syntax.class12;

public class Task3 {
public static void main(String arg[]) {
	//Create a String that will hold a sentence.
	//Write a program to get a new String without any spaces.

    String sen="I am so tierd";
	String newString=sen.replaceAll(" ", "");
	System.out.println(newString);
	//Create a String that should be combination of letters, 
	//numbers and special characters. Find out how many 
	//alpha characters are there in the String.

	String num="my number is 687 68776 #####&^";
		
		num=num.replaceAll("[^A-Za-z]","");
		

System.out.println(num.length());
	
//You have a String a=“Is it saturday? Is it raining?
//Do we have a Java Class today?” 
//How would you find out how many sentences are in that String?

String a="It is Saturday? Is it Raning? Do we have java class today?";
String sent=a.replace("?","]");
String [] prin=sent.split("]");
System.out.println(prin.length);

//or \\
String []prin1=a.split("\\?");
System.out.println(prin1.length);

}
}
