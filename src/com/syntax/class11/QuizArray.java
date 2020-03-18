package com.syntax.class11;
import java.util.Scanner;
public class QuizArray {
public static void main(String args[]) {
	
	// Find out how many alpha characters are present in a String? Find number of
	// words in string?
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter string");
	String a = scan.nextLine();
	String b = a.replaceAll("[A-Za-z0-9]", ""); 
	//replacing everything except characters with "" -->(nothing)
	String c[] = a.split(" "); 
	// Dividing sentence by " "-->(Spaces)
	System.out.println("Characters in string = "+b.length());
	System.out.println("words in string = "+c.length);
}
}

	
	
